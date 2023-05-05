package com.example.brainlevel;

public class Questionsmath {
        public String[] mQuestion = {
                "50+92-6",
                "6x7-3",
                "94+11-56",
                "9+1+5",
                "34+9+7",
                "37-66-2",
                "203-111+4",
                "52-41-1",
                "124+21-59",
                "1001+111",
                "5x2-3",
                "88+19-51",
                "31+78+54",
                "123+6+2",
                "39+74-11 ",
                "412-852",
                "3+6+2",
                "95+15+5",
                "789-123+9",
                "108-16-5"

        };
        public String[][] mChoices ={
                {"136","139","154","220"},
                {"90","139","300","112"},
                {"40","19","49","48"},
                {"11","14","20","15"},
                {"50","55","30","45"},
                {"-34","-35","-45","-20"},
                {"140","100","96","80"},
                {"1","34","21","10"},
                {"86","100","89","200"},
                {"1111","1110","1212","1112"},
                {"0","5","7","19"},
                {"67","56","89","20"},
                {"150","163","155","200"},
                {"100","120","131","150"},
                {"102","180","111","149"},
                {"-140","440","-440","140"},
                {"11","12","13","14"},
                {"109","111","113","115"},
                {"400","675","676","800"},
                {"80","85","87","89"}
        };
        public String[] mCorrectAnswer=
                {"136","139","49","15","50","-35","96",
                        "10","86","1112","7","56","163","131","102",
                        "-440","11","115","675","87"};
        public String getQuestion(int a){
            String question = mQuestion[a];
            return  question;
        }
        public String getChoice1(int a){
            String choice = mChoices[a][0];
            return  choice;
        }
        public String getChoice2(int a){
            String choice = mChoices[a][1];
            return  choice;
        }
        public String getChoice3(int a){
            String choice = mChoices[a][2];
            return  choice;
        }
        public String getChoice4(int a){
            String choice = mChoices[a][3];
            return  choice;
        }
        public String getCorrectAnswer(int a){
            String answer = mCorrectAnswer[a];
            return  answer;
        }
    }


