package com.example.mdb.dao.impl.inmemory;

import com.example.mdb.dao.*;

class InMemoryDaoFactory implements DaoFactory {

    InMemoryDatabase database;

    MovieDao movieDao;
    CommentDao commentDao;
    UserDao userDao;

    InMemoryDaoFactory(InMemoryDatabase database) {
        this.database = database;

        movieDao = new InMemoryMovieDao(database);
        commentDao = new InMemoryCommentDao(database);
        userDao = new InMemoryUserDao(database);
    }

    @Override
    public CommentDao getCommentDao() {
        return commentDao;
    }

    @Override
    public MovieDao getMovieDao() {
        return movieDao;
    }

    @Override
    public UserDao getUserDao() {
        return userDao;
    }

}
