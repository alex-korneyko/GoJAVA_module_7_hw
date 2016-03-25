package ua.goit.gojava.view;

import ua.goit.gojava.model.TrickyCalculator;
import ua.goit.gojava.servicePackage.ExpressionElement;
import ua.goit.gojava.servicePackage.Observer;

import java.util.ArrayList;
import java.util.List;


public class ConsoleDisplay implements Observer {

    List<ExpressionElement> expression = new ArrayList<>();


    public ConsoleDisplay(TrickyCalculator calculator){
        calculator.registerObserver(this);                  //Регистрация у наблюдаемого
        update(expression);                                 //Вывод приглашения на экран сразу при создании объекта
    }

    @Override
    public void update(List<ExpressionElement> expression) {
        //Метод, вызываемый наблюдаемым, чтобы ссобщить, что у него изменилось состояние
        //и передаёт изменения, а наблюдатель (этот объект) должен что-то сделать

        //Вывод на экран конечного выражения
        for (ExpressionElement element: expression){
            System.out.print(element + " ");
        }
        System.out.println();

        //Вывод на экран приглашения
        System.out.print("Enter expression ('0' for exit) --> ");
    }
}