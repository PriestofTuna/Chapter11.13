package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {

    @FXML TextField NumTxt1;
    @FXML TextField NumTxt2;
    @FXML TextField NumTxt3;
    @FXML TextField NumTxt4;
    @FXML TextField NumTxt5;
    @FXML TextField NumTxt6;
    @FXML TextField NumTxt7;
    @FXML TextField NumTxt8;
    @FXML TextField NumTxt9;
    @FXML TextField NumTxt10;
    //Textfields for input
    @FXML TextArea output;

    @FXML public void numbers(ActionEvent actionEvent) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.parseInt(NumTxt1.getText()));
        list.add(Integer.parseInt(NumTxt2.getText()));
        list.add(Integer.parseInt(NumTxt3.getText()));
        list.add(Integer.parseInt(NumTxt4.getText()));
        list.add(Integer.parseInt(NumTxt5.getText()));
        list.add(Integer.parseInt(NumTxt6.getText()));
        list.add(Integer.parseInt(NumTxt7.getText()));
        list.add(Integer.parseInt(NumTxt8.getText()));
        list.add(Integer.parseInt(NumTxt9.getText()));
        list.add(Integer.parseInt(NumTxt10.getText()));
        //The above pulls and inserts the input from sample.fxml into list
        System.out.println(list);
    removeDuplicate(list);
        //calls the method
        output.setText("The definitive integers are" + "\n" + list.toString());
        //sets output
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        int listArray[] = new int[list.size()];
        int cycle = 0;
        int count = 1;
        for (int take: list){
            listArray[cycle] = take;
            cycle++;
        }
        for(int i = list.size() - 1; i > -1; i--) {
            count++;
            for(int j = list.size() - count; j > -1; j--) {
                if(listArray[i] == listArray[j]) {
                    list.remove(i);
                    --i;
                    //removes i whenver i and j are equal
                    //also --i in order to reset properly after its removed
                    //to avoid IndexOutofBoundsExceptions
                }
            }
        }
    }
}
