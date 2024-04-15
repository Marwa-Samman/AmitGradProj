@Smoke

  Feature: Add To WishList

    Scenario: User Can Add To WishList
      Given User Tapped Add Button
      When Success Message Appeared
      Then Message Background is Green

    Scenario: User Can Check Wishlist Qty
      Given User Tapped Add Button
      When Success Message Appeared
      Then User Tap Wishlist Tab
      And Items Qty Is Present
