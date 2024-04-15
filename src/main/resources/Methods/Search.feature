@Smoke

  Feature: User Can Search Products, Get Relevant Results, Results Are Clickable, Clicked Results Return Relevant Content.
    Scenario Outline: User could search using product name
      Given User Tapped Search Bar
      When User Provide Search Keywords As "<ProductName>"
      Then User Get Relevant Search Results

      Examples:
        | ProductName |
        | book |
        | laptop |
        | nike |


    Scenario Outline: User could search for product using sku
      Given User Tapped Search Bar
      When User Provide "<ProductSKU>"
      Then Search Results Are Clickable And Return Relevant Content

      Examples:
        | ProductSKU |
        | SCI_FAITH |
        | APPLE_CAM |
        | SF_PRO_11 |

