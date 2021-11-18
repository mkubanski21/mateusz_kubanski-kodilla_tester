package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double numberOfPosts1 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() >= 40)
                .map(posts -> posts.getNumberOfPost() )
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Number of posts for users older or equal to 40 years old: " + numberOfPosts1);

        double numberOfPosts2 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() < 40)
                .map(posts -> posts.getNumberOfPost() )
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Number of posts for users younger than 40 years old: " + numberOfPosts2);
    }
}
