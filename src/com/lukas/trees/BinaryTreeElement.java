package com.lukas.trees;

import com.lukas.lists.MyList;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.ArrayList;

public class BinaryTreeElement {

    private Integer data;
    private BinaryTreeElement leftElement;
    private BinaryTreeElement rightElement;

    public BinaryTreeElement(Integer data) {
        this.data = data;
    }

    public BinaryTreeElement(BinaryTreeElement leftElement, Integer data, BinaryTreeElement rightElement) {
        this.data = data;
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }

    static BinaryTreeElement exampleTree() {
        BinaryTreeElement root = new BinaryTreeElement(
                new BinaryTreeElement(
                        new BinaryTreeElement(0),
                        3,
                        new BinaryTreeElement(7)
                ),
                5, new BinaryTreeElement(6)
        );
        return root;

    }

    public String toSimpleJSON() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{ \"data\": ").append(data);
        if (leftElement != null) stringBuilder.append(", \"left\": ").append(leftElement.toSimpleJSON());
        if (rightElement != null) stringBuilder.append(", \"right\": ").append(rightElement.toSimpleJSON());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String toFormattedJSON() {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            engine.eval("function toJSON(obj){ return JSON.stringify(JSON.parse(obj),null,4) };");
            Invocable scriptFunction = (Invocable) engine;
            String formattedJSON = scriptFunction.invokeFunction("toJSON", toSimpleJSON()).toString();
            return formattedJSON.replaceAll("\"", "");
        } catch (ScriptException | NoSuchMethodException e) {
            return "";
        }
    }

    public int heightOfTree() {

        int leftHight = (leftElement == null) ? 0 : leftElement.heightOfTree();
        int rightHight = (rightElement == null) ? 0 : rightElement.heightOfTree();

        return Integer.max(leftHight, rightHight) + 1;
    }

    public ArrayList<Integer> getPreOrderList() {
        ArrayList<Integer> preOrderedLis = new ArrayList<>();
        this.addToPreOrderedList(preOrderedLis);
        return preOrderedLis;
    }

    private void addToPreOrderedList(ArrayList<Integer> preOrderedList){
        preOrderedList.add(data);
        if (leftElement != null) {
            leftElement.addToPreOrderedList(preOrderedList);
        }
        if (rightElement != null) {
            rightElement.addToPreOrderedList(preOrderedList);
        }

    }

    public ArrayList<Integer> getInOrderList() {
        ArrayList<Integer> inOrderedLis = new ArrayList<>();
        this.addToInOrderedList(inOrderedLis);
        return inOrderedLis;
    }

    private void addToInOrderedList(ArrayList<Integer> inOrderedList){
        if (leftElement != null) {
            leftElement.addToInOrderedList(inOrderedList);
        }
        inOrderedList.add(data);
        if (rightElement != null) {
            rightElement.addToInOrderedList(inOrderedList);
        }

    }

    public ArrayList<Integer> getPostOrderList() {
        ArrayList<Integer> postOrderedLis = new ArrayList<>();
        this.addToPostOrderedList(postOrderedLis);
        return postOrderedLis;
    }

    private void addToPostOrderedList(ArrayList<Integer> postOrderedList){
        if (leftElement != null) {
            leftElement.addToPostOrderedList(postOrderedList);
        }
        if (rightElement != null) {
            rightElement.addToInOrderedList(postOrderedList);
        }
        postOrderedList.add(data);
    }


    @Override
    public String toString() {
        return "BinaryTreeElement{" +
                "data=" + data +
                ", leftElement=" + leftElement +
                ", rightElement=" + rightElement +
                '}';
    }

    public void printPreOrderList() {
        System.out.print(data + " ");
        if (leftElement != null) {
            leftElement.printPreOrderList();
        }
        if (rightElement != null) {
            rightElement.printPreOrderList();
        }
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public BinaryTreeElement getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(BinaryTreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public BinaryTreeElement getRightElement() {
        return rightElement;
    }

    public void setRightElement(BinaryTreeElement rightElement) {
        this.rightElement = rightElement;
    }
}
