package insurance.system;

import insurance.model.Insurance;

import java.util.List;

public class View {

    public View(){

    }


    public void menu(){
        System.out.println("\n\nТема: Страхование\n\nДоступные действия: \n"
                +"1. Вывести дериватив\n"
                +"2. Посчитать суммарную стоимость взносов\n"
                +"3. Посчитать суммарную компенсацию\n"
                +"4. Сортировать деривативу по уменьшению степени риска\n"
                +"5. Найти обязательства в диапазоне значений взносов\n"
                +"6. Найти обязательства в диапазоне значений компенсаций\n"
                +"7. Найти обязательства в диапазоне значений уровней риска\n"
                +"8. Добавить страховое обязательство\n"
                +"9. Удалить страховое обязательство\n" +
                "10. Выход\n");
    }


    public void outputResults(List<Insurance> results){
        if(results!=null){
            System.out.printf("     %-5s            %-25s    %-20s      %-10s         %-20s  %-15s                    %-30s%n",
                    "№" , "Страховщик", "Страхователь", "Взнос", "Компенсация", "Уровень риска", "Дополнительная информация");
            System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________________________");
            for(int i = 0; i < results.size(); i++){
                System.out.println(results.get(i));
            }
        }
        else{
            System.err.println("Ваш запит не дав результатів!\n\n");
        }
        results = null;
    }
}
