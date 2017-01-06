package com.smore;

import com.smore.entities.Bookmark;
import com.smore.entities.User;
import com.smore.entities.UserBookmark;
import com.smore.managers.BookManager;
import com.smore.managers.UserManager;

/**
 * Created by siddharthmore on 1/5/17.
 */
public class DataStore {

private static final int USER_BOOKMARK_LIMIT = 5;
private static final int BOOKMARK_COUNT_PER_TYPE = 5;
private static final int BOOKMARK_TYPES_COUNT = 3;
private static final int TOTAL_USER_COUNT = 5;

    public static User[] getUsers() {
        return users;
    }

    public static Bookmark[][] getBookmarks() {
        return bookmarks;
    }

    public static UserBookmark[] getUserBookMarks() {
        return userBookMarks;
    }

    private static User[] users = new User[TOTAL_USER_COUNT];
private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPES_COUNT][BOOKMARK_COUNT_PER_TYPE];
private static UserBookmark[] userBookMarks = new UserBookmark[TOTAL_USER_COUNT * USER_BOOKMARK_LIMIT];

public static void loadData() {
    loadUsers();
    loadBookMarks();
    loadMovies();
    loadBooks();
}

private static void loadUsers() {

    users[0] =  UserManager.getInstance().createUser(1000,	"user0@semanticsquare.com",	"test",	"John", 	"M", "User");
    users[1] =  UserManager.getInstance().createUser(1001,	"user0@semanticsquare.com",	"test",	"Sam", 	"M", "User");
    users[2] =  UserManager.getInstance().createUser(1002,	"user0@semanticsquare.com",	"test",	"Anita", 	"M", "Editor");
    users[3] =  UserManager.getInstance().createUser(1003,	"user0@semanticsquare.com",	"test",	"Sara", 	"M", "Editor");
    users[4] =  UserManager.getInstance().createUser(1004,	"user0@semanticsquare.com",	"test",	"Dheeru", 	"M", "chiefEditor");
}


private static void loadMovies() {

    bookmarks[1][0] = BookManager.getInstance().createMovie(3000,"Citizen Kane", new String[]{"Orson Welles","Joseph Cotten"},new String[]{"Orson Welles"},"Classics",8.5,1941);
    bookmarks[1][1] = BookManager.getInstance().createMovie(3001,"Citizen Kane1", new String[]{"Orson Welles1","Joseph Cotten1"},new String[]{"Orson Welles1"},"Classics1",8.5,1941);
    bookmarks[1][2] = BookManager.getInstance().createMovie(3002,"Citizen Kane2", new String[]{"Orson Welles2","Joseph Cotten2"},new String[]{"Orson Welles2"},"Classics2",8.5,1941);
    bookmarks[1][3] = BookManager.getInstance().createMovie(3003,"Citizen Kane3", new String[]{"Orson Welles3","Joseph Cotten3"},new String[]{"Orson Welles3"},"Classics3",8.5,1941);
    bookmarks[1][4] = BookManager.getInstance().createMovie(3004,"Citizen Kane4", new String[]{"Orson Welles4","Joseph Cotten4"},new String[]{"Orson Welles4"},"Classics4",8.5,1941);
}

private static void loadBooks() {

    bookmarks[2][0] = BookManager.getInstance().createBook(4000,"Walden",	new String[]{"Wilder Publications","Henry David Thoreau"},	new String[]{"Philosophy"},4.3,1850);
    bookmarks[2][1] = BookManager.getInstance().createBook(4001,"Walden1",	new String[]{"Wilder Publications1","Henry David Thoreau"},	new String[]{"Philosophy"},4.3,1851);
    bookmarks[2][2] = BookManager.getInstance().createBook(4002,"Walden2",	new String[]{"Wilder Publications2","Henry David Thoreau"},	new String[]{"Philosophy"},4.3,1852);
    bookmarks[2][3] = BookManager.getInstance().createBook(4003,"Walden3",	new String[]{"Wilder Publications3","Henry David Thoreau"},	new String[]{"Philosophy"},4.3,1853);
    bookmarks[2][4] = BookManager.getInstance().createBook(4004,"Walden4",	new String[]{"Wilder Publications4","Henry David Thoreau"},	new String[]{"Philosophy"},4.3,1854);

}


private static void loadBookMarks() {

    bookmarks[0][0] = BookManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2","http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html","http://www.javaworld.com");
    bookmarks[0][1] = BookManager.getInstance().createWebLink(2001,	"How do I import a pre-existing Java project into Eclipse and get up and running?",	"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running	", "http://www.stackoverflow.com");
    bookmarks[0][2] = BookManager.getInstance().createWebLink(2002,	"Interface vs Abstract Class",	"http://mindprod.com/jgloss/interfacevsabstract.html","http://mindprod.com");
    bookmarks[0][3] = BookManager.getInstance().createWebLink(2003,	"NIO tutorial by Greg Travis","http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf","http://cs.brown.edu");
    bookmarks[0][4] = BookManager.getInstance().createWebLink(2004,	"Virtual Hosting and Tomcat",	"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html",	"http://tomcat.apache.org");
}



}
