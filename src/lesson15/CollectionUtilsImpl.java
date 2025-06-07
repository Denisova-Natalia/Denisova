package lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionUtilsImpl implements CollectionUtils {
    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null) {
            throw new NullPointerException();
        }
        //Создаем пустой лист чтобы туда закинуть результат
        Collection<Integer> result = new ArrayList<>();
        for(Integer element : a) {
            if(b.contains(element)) {//метод contains проверяет содержится или нет то или иное значение
                result.add(element);
            }
            for (Integer element2 : b) {
                if(a.contains(element2)) {
                    result.add(element2);
                }
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        return Set.of();
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null) {
            throw new NullPointerException();
        }
        Collection<Integer> timeArrayA = new ArrayList<>(a);
        Collection<Integer> timeArrayB = new ArrayList<>(b);

        timeArrayA.removeAll(timeArrayB);
        timeArrayB.removeAll(timeArrayA);

        timeArrayA.addAll(timeArrayB);

        return timeArrayA;
        /*
        Еще вариант проверить разность
        Проверяем на отсутствие чисел знаком !
        Collection<Integer> result = new ArrayList<>();
        for(Integer element : a) {
            if(!b.contains(element)) {
                result.add(element);
            }
        }
        for(Integer element : b) {
            if(!b.contains(element)) {
                result.add(element);
            }
        }*/
    }
}
