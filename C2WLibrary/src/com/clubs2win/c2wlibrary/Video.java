package com.clubs2win.c2wlibrary;

public class Video extends LibraryItem
{
    private String videoLeadActor;
    private String videoDirector;
    private VideoCategory videoCategory;

    public String getVideoLeadActor() {
        return videoLeadActor;
    }

    public String getVideoDirector() {
        return videoDirector;
    }

    public VideoCategory getVideoCategory() {
        return videoCategory;
    }

    public Video(String title, String leadActor, String director,VideoCategory category)
    {
        super(title);
        videoLeadActor = leadActor;
        videoDirector = director;
        videoCategory = category;
    }

    @Override
    public String toString()
    {
        return "Title = " +  this.getItemTitle() + " Lead Actor = " + videoLeadActor +
                " Director  = " + videoDirector + " Category = " + videoCategory +
                " IsAvailable = " + !this.isCheckedOut() + "\n\n";
    }
}

