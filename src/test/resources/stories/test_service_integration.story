Meta:

Narrative:
As a user
I want to verify service integration works
So that I push deployment to higher environment

Scenario: 1 We test the system integration
Given We add a new Person to the backend
When We retrieve the person using rest endpoint
Then It should be the expected person
