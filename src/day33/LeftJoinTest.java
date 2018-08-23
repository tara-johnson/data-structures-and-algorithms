package day33;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeftJoinTest {

    @Test
    void leftJoinTest() {
    Map<String, String> mapOne = new HashMap<>();
    Map<String, String> mapTwo = new HashMap<>();

    mapOne.put("fond", "enamored");
    mapOne.put("wrath", "anger");
    mapOne.put("diligent", "employed");
    mapOne.put("outfit", "garb");
    mapOne.put("guide", "usher");

    mapTwo.put("fond", "averse");
    mapTwo.put("wrath", "delight");
    mapTwo.put("diligent", "idle");
    mapTwo.put("guide", "follow");
    mapTwo.put("flow", "jam");

    System.out.println(mapOne);
    System.out.println(mapTwo);

    String expected = "{diligent=[employed, idle], outfit=[garb, null], wrath=[anger, delight], guide=[usher, follow], fond=[enamored, averse]}";
    String result = LeftJoin.leftJoin(mapOne, mapTwo).toString();

    System.out.println("Expected:" + expected);
    System.out.println("Result: " + result);

    assertEquals(expected, result);
    }

    @Test
    void oneMapLongerTest() {
        Map<String, String> mapOne = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        mapOne.put("fond", "enamored");
        mapOne.put("wrath", "anger");
        mapOne.put("diligent", "employed");
        mapOne.put("outfit", "garb");
        mapOne.put("guide", "usher");
        mapOne.put("class", "dashing");

        mapTwo.put("fond", "averse");
        mapTwo.put("wrath", "delight");
        mapTwo.put("diligent", "idle");
        mapTwo.put("guide", "follow");
        mapTwo.put("flow", "jam");

        System.out.println(mapOne);
        System.out.println(mapTwo);

        String expected = "{diligent=[employed, idle], outfit=[garb, null], wrath=[anger, delight], class=[dashing, null], guide=[usher, follow], fond=[enamored, averse]}";
        String result = LeftJoin.leftJoin(mapOne, mapTwo).toString();

        System.out.println("Expected:" + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void leftEmptyMapTest() {
        Map<String, String> mapOne = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        mapTwo.put("fond", "averse");
        mapTwo.put("wrath", "delight");
        mapTwo.put("diligent", "idle");
        mapTwo.put("guide", "follow");
        mapTwo.put("flow", "jam");

        System.out.println(mapOne);
        System.out.println(mapTwo);

        String expected = "{}";
        String result = LeftJoin.leftJoin(mapOne, mapTwo).toString();

        System.out.println("Expected:" + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }

    @Test
    void rightEmptyMapTest() {
        Map<String, String> mapOne = new HashMap<>();
        Map<String, String> mapTwo = new HashMap<>();

        mapOne.put("fond", "enamored");
        mapOne.put("wrath", "anger");
        mapOne.put("diligent", "employed");
        mapOne.put("outfit", "garb");
        mapOne.put("guide", "usher");

        System.out.println(mapOne);
        System.out.println(mapTwo);

        String expected = "{diligent=[employed, null], outfit=[garb, null], wrath=[anger, null], guide=[usher, null], fond=[enamored, null]}";
        String result = LeftJoin.leftJoin(mapOne, mapTwo).toString();

        System.out.println("Expected:" + expected);
        System.out.println("Result: " + result);

        assertEquals(expected, result);
    }
}