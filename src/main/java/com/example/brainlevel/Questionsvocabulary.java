package com.example.brainlevel;

public class Questionsvocabulary {
    public String[] mQuestion = {
            "มด",
            "หมี",
            "แมว",
            "กวาง",
            "ช้าง",
            "แอปเปิ้ล",
            "บลูเบอร์รี่",
            "เชอรี่",
            "ทุเรียน",
            "องุ่น",
            "Banker",
            "Consumer",
            "Contractor",
            "Engineer",
            "Designer",
            "จิงโจ้",
            "กีวี",
            "Chair",
            "มะม่วง",
            "Knife"

    };
    public String[][] mChoices ={
            {"Ant","Alligator","Bat","Bird"},
            {"Bee","Buffalo","Bear","Butterfly"},
            {"Chicken","Cat","Crab","Cow"},
            {"Deer","Dog","Duck","Donkey"},
            {"Earthworm","Dragonfly","Fox","Elephant"},
            {"Apricot","Apple","Avocabo","Banana"},
            {"Cantaloupe","Cherimoya","Blueberry","Breadfruit"},
            {"Cherry","Chinese pear","Cloudberry","Coconut"},
            {"Fig","Durian","Elderberry","Grapefruit"},
            {"Graprfruit","Guava","Jackfruit","Grape"},
            {"ธนาคาร","นายหน้า","นายธนาคาร","นักวาดภาพ"},
            {"ผู้ทำสัญญา","ผู้บริโภค","นักพัฒนา","ลูกจ้าง"},
            {"นักพัฒนา","ช่างวาดภาพ","ผู้ออกแบบ","ผู้ทำสัญญา"},
            {"วิศวกร","วิศวกรรม","นักเศรษฐศาสตร์","ผู้ออกแบบ"},
            {"ออกแบบ","นักสืบ","ผู้ออกแบบ","เจ้าหนี้"},
            {"Lizard","Koala","Lion","Kangaroo"},
            {"Kumquat","Kiwi","Langsat","Longan"},
            {"เก้าอี้","เตียง","ม้านั่ง","กระจก"},
            {"Marian plum","Mangosteen","Melon","Mango"},
            {"อัศวิน","แก้ว","มีด","เหยื่อ"},



    };
    public String[] mCorrectAnswer=
            {"Ant","Bear","Cat","Deer","Elephant","Apple","Blueberry",
                  "Cherry","Durian","Grape","นายธนาคาร","ผู้บริโภค","ผู้ทำสัญญา","วิศวกร","ผู้ออกแบบ",
                  "Kangaroo","Kiwi","เก้าอี้","Mango","มีด"};
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


