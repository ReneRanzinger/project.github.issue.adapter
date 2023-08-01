package org.github.reneranzinger.project.githubadapter;

import net.sf.mpxj.ProjectFile;
import net.sf.mpxj.reader.UniversalProjectReader;

public class TestingApp
{
    // https://www.mpxj.org/howto-read-mpp/
    public static void main(String[] args)
    {
        UniversalProjectReader reader = new UniversalProjectReader();
        ProjectFile project = reader.read("my-sample.mpp");
    }

}
