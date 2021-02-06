package cd.amateurmobiledev.androidroadmap.model;

import java.util.Collections;
import java.util.List;

public class QuestionBanck {

    private List<Question> questionList;
    private int nextQuestionIndex;

    public QuestionBanck(List<Question> questionList) {
        this.questionList = questionList;

        Collections.shuffle(questionList);

        nextQuestionIndex = 0;
    }

    public Question getQuestion(){
        if (nextQuestionIndex == questionList.size()){
            nextQuestionIndex = 0;
        }

        return questionList.get(nextQuestionIndex++);
    }
}
