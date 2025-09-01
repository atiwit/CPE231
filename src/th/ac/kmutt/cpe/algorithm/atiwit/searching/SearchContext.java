package th.ac.kmutt.cpe.algorithm.atiwit.searching;

import java.util.ArrayList;

import th.ac.kmutt.cpe.algorithm.atiwit.searching.SearchStrategy;

public class SearchContext<T extends Comparable<T>> {
    private SearchStrategy<T> strategy;

    public SearchContext(SearchStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SearchStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public int executeSearch(ArrayList<T> list, T target) {
        return strategy.search(list, target);
    }
}
