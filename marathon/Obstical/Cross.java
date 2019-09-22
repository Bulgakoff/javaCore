package GBmainEgit.javaCore.git.marathon.Obstical;

import GBmainEgit.javaCore.git.marathon.Actions.Competitor;
import GBmainEgit.javaCore.git.marathon.Actions.Obstacle;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(length);
    }
}