package org.java_tutorials.tuition.shahir.part_1.tutorials_14;

import java.util.StringTokenizer;

public class StringToken
{
    public static void main(String[] args) {
        String s= """
                3 April 2023
                To,
                The principal
                Kerala Samajam Model School,
                Punjabi Refugee Colony,\s
                Golmuri, Jamshedpur,\s
                Jharkhand 831009
                
                Subject: Regarding the name not included in the class XI student list.
                
                Dear Principal,
                I am writing to bring to your attention an issue that I am facing with regards to my admission into Class XI. I have recently discovered that my name is not included in the list of students enrolled in the class, and I would like to explain the reason behind this. I am Ayyan Jamal, a student of Class X C with Roll No. 13.
                \s
                I had applied for admission to Class XI and had completed all the necessary formalities including filling out the admission form and paying the fees online. However, due to some unforeseen circumstances, I was not able to pay the online amount on time. As a result, my admission was not processed, and my name was not included in the list of students enrolled in Class XI.
                \s
                I understand that this was an oversight on my part, and I take full responsibility for it. However, I would like to request your kind consideration in this matter. I am a diligent and hardworking student, and I am eager to continue my studies in your esteemed institution. I would be grateful if you could kindly allow me to enroll in Class XI, even at this late stage.
                \s
                I assure you that I will make every effort to catch up on any missed work and to maintain my academic performance at the highest level. I am confident that I will be able to prove myself to be a worthy student of your institution, and I hope that you will give me the opportunity to do so.
                \s
                Thank you for your time and consideration.
                \s
                Yours Sincerely,
                Ayyan Jamal
                
                """;
        StringTokenizer st=new StringTokenizer(s," ");
        int c=0;
        while (st.hasMoreTokens())
        {
            c++;
            st.nextToken();
        }
        System.out.println("Not of word in your book is = "+c);
    }
}
