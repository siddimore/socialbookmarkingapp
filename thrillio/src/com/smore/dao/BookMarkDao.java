package com.smore.dao;

import com.smore.DataStore;
import com.smore.entities.Bookmark;

/**
 * Created by siddharthmore on 1/5/17.
 */
public class BookMarkDao
{
    public Bookmark[][] getBookMarks() {
        return DataStore.getBookmarks();
    }
}
