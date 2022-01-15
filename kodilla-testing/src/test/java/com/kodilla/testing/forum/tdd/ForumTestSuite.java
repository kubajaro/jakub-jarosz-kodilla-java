package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.testing.forum.ForumComment;
import com.kodilla.testing.testing.forum.ForumPost;
import com.kodilla.testing.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite ")
public class ForumTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("ths is the beginning of tests");
    }

    @AfterAll
    public static void afterAllTest(){
        System.out.println("All test have been finished");
    }

    @BeforeEach
    public void beforeEveryTests(){
        testCounter++;
        System.out.println("Preparing for test no. " + testCounter);
    }

    @Nested
    @DisplayName("Tests for posts")
    class TestPosts {
        @Test
        void testAddPost() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");

            //when
            testUser.addPost(testUser.getName(), "test post");

            //then
            Assertions.assertEquals(1, testUser.getPostsQuantity());
        }

        @Test
        void testGetPost() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());
            testUser.addPost(testUser.getName(), testPost.getPostBody());

            //when
            ForumPost retrievedPost;
            retrievedPost = testUser.getPost(0);

            //then
            Assertions.assertEquals(testPost, retrievedPost);
        }

        @Test
        void testRemovePostNotExisting() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());

            //when
            boolean testResult = testUser.removePost(testPost);

            //then
            Assertions.assertFalse(testResult);
        }

        @Test
        void testRemovePostExisting() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());
            testUser.addPost(testUser.getName(), testPost.getPostBody());

            //when
            boolean testResult = testUser.removePost(testPost);

            //then
            Assertions.assertTrue(testResult);
            Assertions.assertEquals(0, testUser.getPostsQuantity());
        }
    }

    @Nested
    @DisplayName("Tests for comments")
    class testComments {
        @Test
        void testAddComment() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("test post body", testUser.getName());

            //when
            testUser.addComment(testPost, testUser.getName(), "test comment body");

            //then
            Assertions.assertEquals(1, testUser.getCommentQuantity());
        }

        @Test
        void testGetComment() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());
            ForumComment testComment = new ForumComment(testPost, "the test comment body", testUser.getName());
            testUser.addComment(testPost, testUser.getName(), testComment.getCommentBody());

            //when
            ForumComment retrievedComment;
            retrievedComment = testUser.getComment(0);

            //then
            Assertions.assertEquals(testComment, retrievedComment);
        }

        @Test
        void testRemoveCommentNotExisting() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());
            ForumComment testComment = new ForumComment(testPost, "test comment body", testUser.getName());

            //when
            boolean testResult = testUser.removeComment(testComment);

            //then
            Assertions.assertFalse(testResult);
        }

        @Test
        void testRemoveCommentExisting() {
            //given
            ForumUser testUser = new ForumUser("aa", "andrew anderson");
            ForumPost testPost = new ForumPost("the test post", testUser.getName());
            ForumComment testComment = new ForumComment(testPost, "test comment body", testUser.getName());
            testUser.addComment(testPost, testUser.getName(), testComment.getCommentBody());

            //when
            boolean testResult = testUser.removeComment(testComment);

            //then
            Assertions.assertTrue(testResult);
            Assertions.assertEquals(0, testUser.getCommentQuantity());
        }
    }
}
