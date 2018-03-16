package observer.pattern;

//Наблюдаемый или Издатель
public interface Observable {
    //добавить наблюдателя или подписчика
    public void addObserver(Observer o);

    //удалить подписчика
    public void removeObserver(Observer o);

    //уведомить подписчика
    public void notifyObservers();

}
