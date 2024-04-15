@Smoke

  Feature: Add To WishList


    Scenario: User Can Add To WishList
      Given User Tapped Add Button
      Then Success Message Appeared
      And Message Background is Green


    Scenario: User Can Check Wishlist Qty
      Given User Tapped Add Button
      When User Tap Wishlist Tab
      Then Items Qty Is Present
