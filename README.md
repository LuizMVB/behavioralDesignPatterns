# behavioralDesignPatterns

A simple project with the goal of to apply the main behavioral patterns of GoF

## More about the domain

It's a dummy financial management module with some business rules that allows to implement some of the main behavioral design patterns

## Wich rule and what patterns is implemented here?

### First rule: sporadic salary movement (implemented with Strategy pattern)

The sporadic salary movement is based on job level of an employee

- beginner: 20% of the actual salary
- intermediary: 40% of the actual salary
- advanced: 80% of the actual salary

### Second rule: annual salary movement (implemented with Chain of Responsability and Template Method pattern)

There are some criteria for defining annual salary movements. This criateria has a priority rule between them. 

The annual salary movement must be based, first, by salary amount

> If employee receive 20k or more per month, his annual movement must be 60%

Second, by level

> If employee has an advanced or intermediary level, must receive 40% more per year

Third, by time of contribution

> If employee has more than one year of contribution, he must receive 20% more

Fourth

> If employee does not match any of this criteria, doesn't receive annual movement

An employee cant receive the benefits of more than one criteria

### Third rule: job level specification (implemented with State patern)

Every job level has a specification: bronze, silver or gold

These specifications are part of a sublevel division and can change by promotion

Bronze to Silver

> Employee receive a salary movement of 20%

Silver to Gold

> Employee receive a salary movement of 40%

Gold to anything

> Can't happen
