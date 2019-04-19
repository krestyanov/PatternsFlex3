package com.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("1. Java ...");
        jobSite.addVacancy("2. Java ...");


        Observer firstSubscriber = new Subscriber("Ivan Krest");
        Observer secondSubscriber = new Subscriber("Doga Ion");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("3. Java ...");

    }

}
