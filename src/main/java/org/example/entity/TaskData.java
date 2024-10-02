package org.example.entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TaskData {

    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getTasks(String name) {
        Set<Task> unionTasks = new HashSet<>();
        unionTasks.addAll(annsTasks);
        unionTasks.addAll(bobsTasks);
        unionTasks.addAll(carolsTasks);
        return switch (name) {
            case "ann" -> annsTasks;
            case "bob" -> bobsTasks;
            case "carol" -> carolsTasks;
            case "all" -> unionTasks;
            default -> unassignedTasks;
        };
    }
    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public void setAnnsTasks(Set<Task> annsTasks) {
        this.annsTasks = annsTasks;
    }

    public void setBobsTasks(Set<Task> bobsTasks) {
        this.bobsTasks = bobsTasks;
    }

    public void setCarolsTasks(Set<Task> carolsTasks) {
        this.carolsTasks = carolsTasks;
    }

    public void setUnassignedTasks(Set<Task> unassignedTasks) {
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getUnion(Set<Task> allTask, Set<Task> allTask1) {
        Set<Task> total = new HashSet<>(allTask);
        total.addAll(allTask1);
        return total;
    }

    public Set<Task> getIntersection(Set<Task> a, Set<Task> b) {
        Set<Task> taskCopy = new HashSet<>(a);
        taskCopy.retainAll(b);
        return taskCopy;
    }

    public Set<Task> getDifferences(Set<Task> a, Set<Task> b) {
        Set<Task> taskCopy = new HashSet<>(a);
        taskCopy.removeAll(b);
        return taskCopy;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
