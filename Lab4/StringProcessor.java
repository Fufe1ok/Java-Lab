package ua.lviv.iot;




import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.util.regex.Matcher;

import java.util.regex.Pattern;


    public class StringProcessor {


        public String readInputText() throws IOException{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter StringProcessor");

            return br.readLine();

        }


        public String processText(String inputText){

            Pattern pattern = Pattern.compile("[A-Za-z]+\\s+[A-Za-z]+\\s*[0-9]+[a-z]*");



            Matcher matcher = pattern.matcher(inputText);


            StringBuffer sb = new StringBuffer();

            while (matcher.find()){

                matcher.appendReplacement(sb, "TV_SET");

            }

            matcher.appendTail(sb);


            return sb.toString();

        }


        public void showResults(String resultText){

            System.out.println(resultText);

        }



    }
