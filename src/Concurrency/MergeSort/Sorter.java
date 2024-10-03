package Concurrency.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> l;
    ExecutorService es;
    Sorter(List<Integer> l, ExecutorService es) {
        this.l = l;
        this.es = es;
    }
    List<Integer> mergeSortedList(List<Integer> l1, List<Integer> l2) {
        List<Integer> finalList = new ArrayList<>();
        int i = 0, j = 0;
        while(i < l1.size() && j < l2.size()) {
            if(l1.get(i) < l2.get(j)) {
                finalList.add(l1.get(i));
                i++;
            }
            else{
                finalList.add(l2.get(j));
                j++;
            }
        }
        while(i < l1.size()) {
            finalList.add(l1.get(i));
            i++;
        }
        while(j < l2.size()) {
            finalList.add(l2.get(j));
            j++;
        }

        return finalList;
    }
    public List<Integer> call() throws ExecutionException, InterruptedException {
        if(l.size() == 1)
            return l;
        int mid = l.size()/2;
        List<Integer> leftList = l.subList(0, mid);
        List<Integer> rightList = l.subList(mid, l.size());

        Sorter leftSorter = new Sorter(leftList, es);
        Sorter rightSorter = new Sorter(rightList, es);

        Future<List<Integer>> leftSortedListFuture = es.submit(leftSorter);
        Future<List<Integer>> rightSortedListFuture = es.submit(rightSorter);

        return mergeSortedList(leftSortedListFuture.get(), rightSortedListFuture.get());
    };

}
