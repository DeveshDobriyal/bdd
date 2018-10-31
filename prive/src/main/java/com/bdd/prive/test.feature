Feature: Create 
new Order Proposal Queue screen under Ordering > Order book

Scenario: User should be able to create 
an order Proposal
Given As an Advisor
When A user tries to process a new order
Then An order should be created in the Order Proposal Queue
And If it presses the CONFIRM button it goes to Pre-trade-queue
But test 



