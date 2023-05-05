package com.example.brainlevel;

public class QuestionsJigsaw9 {
    public String[] MatQuestion = {
            "",
            "",
            "",
    };
    public Integer[][] QuestionImagesMat = {
            {R.drawable.img909,R.drawable.img908,R.drawable.img907,R.drawable.img906,R.drawable.img905,R.drawable.img904,R.drawable.img903,R.drawable.img902,R.drawable.img901},
            {R.drawable.img914,R.drawable.img913,R.drawable.img911,R.drawable.img915,R.drawable.img912,R.drawable.img919,R.drawable.img918,R.drawable.img916,R.drawable.img917},
            {R.drawable.img927,R.drawable.img921,R.drawable.img926,R.drawable.img922,R.drawable.img928,R.drawable.img923,R.drawable.img925,R.drawable.img924,R.drawable.img929},

    };
    public String[] TextQuestion1=
            {"","",""};
    public String[] TextQuestion2=
            {"","",""};
    public String[] TextQuestion3=
            {"","",""};
    public String[] TextQuestion4=
            {"","",""};
    public String[] TextQuestion5=
            {"","",""};
    public String[] TextQuestion6=
            {"","",""};
    public String[] TextQuestion7=
            {"","",""};
    public String[] TextQuestion8=
            {"","",""};
    public String[] TextQuestion9=
            {"","",""};

    public Integer[] CorrectImage1=
            {R.id.imgmat99,R.id.imgmat93,R.id.imgmat92};
    public Integer[] CorrectImage2=
            {R.id.imgmat98,R.id.imgmat95,R.id.imgmat94};
    public Integer[] CorrectImage3=
            {R.id.imgmat97,R.id.imgmat92,R.id.imgmat96};
    public Integer[] CorrectImage4=
            {R.id.imgmat96,R.id.imgmat91,R.id.imgmat98};
    public Integer[] CorrectImage5=
            {R.id.imgmat95,R.id.imgmat94,R.id.imgmat97};
    public Integer[] CorrectImage6=
            {R.id.imgmat94,R.id.imgmat98,R.id.imgmat93};
    public Integer[] CorrectImage7=
            {R.id.imgmat93,R.id.imgmat99,R.id.imgmat91};
    public Integer[] CorrectImage8=
            {R.id.imgmat92,R.id.imgmat97,R.id.imgmat95};
    public Integer[] CorrectImage9=
            {R.id.imgmat91,R.id.imgmat96,R.id.imgmat99};


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
    public Integer getChoice5(int a){
        Integer question = QuestionImagesMat[a][4];
        return question;
    }
    public Integer getChoice6(int a){
        Integer question = QuestionImagesMat[a][5];
        return question;
    }
    public Integer getChoice7(int a){
        Integer question = QuestionImagesMat[a][6];
        return question;
    }
    public Integer getChoice8(int a){
        Integer question = QuestionImagesMat[a][7];
        return question;
    }
    public Integer getChoice9(int a){
        Integer question = QuestionImagesMat[a][8];
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
    public String getQuestionText5(int a){
        String textQ = TextQuestion5[a];
        return textQ;
    }
    public String getQuestionText6(int a){
        String textQ = TextQuestion6[a];
        return textQ;
    }
    public String getQuestionText7(int a){
        String textQ = TextQuestion7[a];
        return textQ;
    }
    public String getQuestionText8(int a){
        String textQ = TextQuestion8[a];
        return textQ;
    }
    public String getQuestionText9(int a){
        String textQ = TextQuestion9[a];
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
    public Integer getCorrectAnswer5(int a){
        Integer answer = CorrectImage5[a];
        return answer;
    }
    public Integer getCorrectAnswer6(int a){
        Integer answer = CorrectImage6[a];
        return answer;
    }
    public Integer getCorrectAnswer7(int a){
        Integer answer = CorrectImage7[a];
        return answer;
    }
    public Integer getCorrectAnswer8(int a){
        Integer answer = CorrectImage8[a];
        return answer;
    }
    public Integer getCorrectAnswer9(int a){
        Integer answer = CorrectImage9[a];
        return answer;
    }

}

