package GBmainEgit.javaCore.git.marathon.Obstical;

import GBmainEgit.javaCore.git.marathon.Actions.Competitor;
import GBmainEgit.javaCore.git.marathon.Actions.Obstacle;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}