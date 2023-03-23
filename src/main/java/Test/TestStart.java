package Test;

import Questions.QuestionGenerate;

import java.util.Random;


public class TestStart {

    QuestionGenerate questionGenerate = new QuestionGenerate();





    public int rndQuestion(){
        int rnd;
        Random random = new Random();
        int max = 10;
        int min = 1;
        rnd = random.nextInt(max + min) + min;
        return rnd;
    }
    public void chooseQuestion(){
        questionGenerate.showQuestion(rndQuestion());
    }
}
