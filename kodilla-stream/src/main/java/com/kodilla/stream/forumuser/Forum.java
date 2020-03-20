package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forum = new ArrayList<>();

    public Forum(){
        forum.add(new ForumUser(1, "darek", 'M', LocalDate.of(1997, 4, 16), 0));
        forum.add(new ForumUser(2, "jarek", 'M', LocalDate.of(2000, 2, 22), 10));
        forum.add(new ForumUser(3, "marek", 'M', LocalDate.of(1990, 8, 13), 1357));
        forum.add(new ForumUser(4, "bożena", 'F', LocalDate.of(1986, 7, 2), 22));
        forum.add(new ForumUser(5, "krystyna", 'F', LocalDate.of(1974, 11, 1), 76));
        forum.add(new ForumUser(6, "alicja", 'F', LocalDate.of(1999, 12, 13), 987));
        forum.add(new ForumUser(7, "szymon", 'M', LocalDate.of(2002, 3, 7), 12));
        forum.add(new ForumUser(8, "natalia", 'F', LocalDate.of(1991, 5, 3), 364));
        forum.add(new ForumUser(9, "jolka", 'F', LocalDate.of(1993, 6, 30), 2));
        forum.add(new ForumUser(10, "mirek", 'M', LocalDate.of(1988, 8, 31), 0));
    }

    public List<ForumUser> getForumList(){
        return forum;
    }

}
