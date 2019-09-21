package GBmainEgit.javaCore.git.marathon.Obstical;

import GBmainEgit.javaCore.git.marathon.Actions.Competitor;
import GBmainEgit.javaCore.git.marathon.Actions.Obstacle;

public class Course extends Obstacle {

    @Override
    public void doIt(Competitor competitor) {
        competitor.info();
    }
}
