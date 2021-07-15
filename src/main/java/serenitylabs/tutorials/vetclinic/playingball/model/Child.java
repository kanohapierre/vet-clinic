package serenitylabs.tutorials.vetclinic.playingball.model;

import static serenitylabs.tutorials.vetclinic.playingball.model.Game.*;

public class Child {

    public void goPlay(Game game) {
        Player gameToPlay = PlayerForGame.called(game);
        gameToPlay.play();
//        if (game == Football) {
//            new PlayFootBall().play();
//        } else if (game == Tennis) {
//            new PlayTennis().play();
//        } else if (game == Cricket) {
//            new PlayCricket().play();
//        } else if (game == Handball) {
//            new PlayHandball().play();
//        } else if (game == Hockey) {
//            new PlayHockey().play();
//        }
    }
}
