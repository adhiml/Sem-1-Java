/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020.Q5;

/**
 *
 * @author saada
 */
public class Job {
    
    public String job;
    public int tasks;
    public int memory;
    
    public Job (String j, int t, int m) {
        this.job = j;
        this.tasks = t;
        this.memory = m;
    }
    
    public String getJob () {
        return job;
    }
    
     public int getTasks () {
        return tasks;
    }
     
      public int getMemory () {
        return memory;
    }
      
    
      @Override
      
      public String toString () {
          return String.format("Job: %s \tMemory: %d \tTasks: %d" , job, memory, tasks);
      }
}
