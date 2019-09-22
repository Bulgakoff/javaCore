package GBmainEgit.javaCore.git.marathon.Obstical;

import GBmainEgit.javaCore.git.marathon.Actions.Competitor;
import GBmainEgit.javaCore.git.marathon.Actions.Obstacle;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}