/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyears.PY2020.Q5;


public class CloudPackaging extends Cloud {
    
    public int core;
    public int memory;
    public double pricePerHour;
    
    public CloudPackaging (String cloudPackage, int core, int memory, double pricePerHour) {
        super(cloudPackage);
        this.core = core;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean Check (Job job) {
        return memory >= job.getMemory();   // return true if the condition is fulfilled
    }
    
    public void totalCost (Job job) {
        totalCost = (job.getTasks()/core) * pricePerHour;
    }
}
