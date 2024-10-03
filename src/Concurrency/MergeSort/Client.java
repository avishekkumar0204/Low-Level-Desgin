package Concurrency.MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        Sorter l = new Sorter(List.of(3,4,23,2,3,4,65,6,3,2,4), es);
        Future<List<Integer>> result = es.submit(l);

        System.out.println(result.get());
    }
}
