//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Вывод данных задачи 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("______");

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Вывод данных задачи 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("______");

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper + 4;
        System.out.println("Вывод данных задачи 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println("______");

        System.out.println("Вывод данных задачи 4");
        var friend = 19;
        System.out.println(friend);
        friend = (friend + 4) / 7;
        System.out.println(friend);
        System.out.println("______");

        System.out.println("Вывод данных задачи 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("______");

        var boxer1Weight = 78.6;
        var boxer2Weight = 87.2;
        var commonWeight = boxer1Weight + boxer2Weight;
        System.out.println("Вывод данных задач 6 и 7");
        System.out.println("Общий вес боксеров равен " + commonWeight + "кг");
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе боксеров равна " + weightDifference + "кг");
        var modulo = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления веса одного боксера на вес другого равен " + modulo);
        System.out.println("______");

        var totalWorktime = 640;
        var singleWorkertime = 8;
        var totalWorkers = (totalWorktime / singleWorkertime);
        System.out.println("Вывод данных задачи 8");
        System.out.println("Всего в компании работает " + totalWorkers + " человек");
        System.out.println("Если в компании работает " + (totalWorkers + 94) + " человек(а), то всего " + ((totalWorkers + 94) * singleWorkertime) + " часов работы может быть поделено между сотрудниками.");

    }
}