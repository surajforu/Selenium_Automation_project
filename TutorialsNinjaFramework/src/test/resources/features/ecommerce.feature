Feature: TutorialsNinja E-Commerce Flow
@Smoke
Scenario: Complete E-Commerce Automation

Given User opens browser
And User launches TutorialsNinja website

When User clicks My Account
And User clicks Register
And User enters registration details
And User clicks Continue button

And User clicks Logout

And User clicks Login
And User enters valid email and password
And User clicks Login button

And User searches for "HP LP3065"
And User selects the product
And User clicks Add To Cart button
And User goes to cart

Then Product should be visible in cart