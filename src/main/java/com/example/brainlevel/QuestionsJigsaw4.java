package com.example.brainlevel;

public class QuestionsJigsaw4 {
    public String[] MatQuestion = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
    };
    public Integer[][] QuestionImagesMat = {
            {R.drawable.img403,R.drawable.img402,R.drawable.img401,R.drawable.img404},
            {R.drawable.img413,R.drawable.img412,R.drawable.img411,R.drawable.img414},
            {R.drawable.img422,R.drawable.img421,R.drawable.img424,R.drawable.img423},
            {R.drawable.img432,R.drawable.img431,R.drawable.img434,R.drawable.img433},
            {R.drawable.img442,R.drawable.img443,R.drawable.img441,R.drawable.img444},
            {R.drawable.img451,R.drawable.img452,R.drawable.img453,R.drawable.img454},
            {R.drawable.img463,R.drawable.img462,R.drawable.img464,R.drawable.img461},
    };
    public String[] TextQuestion1=
            {"","","","","","",""};
    public String[] TextQuestion2=
            {"","","","","","",""};
    public String[] TextQuestion3=
            {"","","","","","",""};
    public String[] TextQuestion4=
            {"","","","","","",""};



    public Integer[] CorrectImage1=
            {R.id.imgmat3,R.id.imgmat3,R.id.imgmat2,R.id.imgmat2,R.id.imgmat3,R.id.imgmat1,R.id.imgmat4};
    public Integer[] CorrectImage2=
            {R.id.imgmat2,R.id.imgmat2,R.id.imgmat1,R.id.imgmat1,R.id.imgmat1,R.id.imgmat2,R.id.imgmat2};
    public Integer[] CorrectImage3=
            {R.id.imgmat1,R.id.imgmat1,R.id.imgmat4,R.id.imgmat4,R.id.imgmat2,R.id.imgmat3,R.id.imgmat1};
    public Integer[] CorrectImage4=
            {R.id.imgmat4,R.id.imgmat4,R.id.imgmat3,R.id.imgmat3,R.id.imgmat4,R.id.imgmat4,R.id.imgmat3};


    public String getQuestion(int a){
        String question = MatQuestion[a];
        return question;
    }
    public Integer getChoice1(int a){
        Integer question = QuestionImagesMat[a][0];
        return question;
    }
    public Integer getChoice2(int a){
        Integer question = QuestionImagesMat[a][1];
        return question;
    }
    public Integer getChoice3(int a){
        Integer question = QuestionImagesMat[a][2];
        return question;
    }
    public Integer getChoice4(int a){
        Integer question = QuestionImagesMat[a][3];
        return question;
    }
    public String getQuestionText1(int a){
        String textQ = TextQuestion1[a];
        return textQ;
    }
    public String getQuestionText2(int a){
        String textQ = TextQuestion2[a];
        return textQ;
    }
    public String getQuestionText3(int a){
        String textQ = TextQuestion3[a];
        return textQ;
    }
    public String getQuestionText4(int a){
        String textQ = TextQuestion4[a];
        return textQ;
    }

    public Integer getCorrectAnswer1(int a){
        Integer answer = CorrectImage1[a];
        return answer;
    }
    public Integer getCorrectAnswer2(int a){
        Integer answer = CorrectImage2[a];
        return answer;
    }
    public Integer getCorrectAnswer3(int a){
        Integer answer = CorrectImage3[a];
        return answer;
    }
    public Integer getCorrectAnswer4(int a){
        Integer answer = CorrectImage4[a];
        return answer;
    }

}

