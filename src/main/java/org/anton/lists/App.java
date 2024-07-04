package org.anton.lists;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

    public static String getOrDefault(List<String> collection, int index, String defaultValue) {
        if (index >= collection.size() || index < 0) return defaultValue;
        else return collection.get(index);
    }

    // Seek items by for-each
    public static List<Integer> replaceByZero(List<Integer> numbers) {
        List<Integer> noNegativeNumbersList = new ArrayList<Integer>();
        for (Integer num : numbers) {
            if (num < 0) noNegativeNumbersList.add(0);
            else noNegativeNumbersList.add(num);
        }
        return noNegativeNumbersList;
    }

    // Find product title where price in range minPace - maxPrice
    public static List<String> getProductsByPrice(List<Product> products, int minPrice, int maxPrice) {
        List<String> result = new ArrayList<String>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                result.add(product.getTitle());
            }
        }
        return result;
    }

    // Use interface List to work with all impl of List
    public static int countBooks(List<Book> books, String name, String genre) {
        int result = 0;
        for (Book book : books) {
            if (book.getAuthorName().equals(name) && book.getGenre().equals(genre)) result++;
        }
        return result;
    }

    // Use common-collection4 to find intersection
    public static List<User> getCommonFriends(User user1, User user2) {
        return (List<User>) CollectionUtils.intersection(user1.getFriends(), user2.getFriends());
    }

    // Find cars before date of manufactured
    public static List<String> getCars(List<Car> cars, int date) {
        List<String> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getManufacturedAt().getYear() < date) result.add(car.toString());
        }
        result.sort(String::compareToIgnoreCase);
        return result;
    }

    // Check Brackets Balance
    public static boolean isBracketsBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') stack.add('(');
            else if (input.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
