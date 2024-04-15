@Smoke

  Feature: User Can Navigate To Product Page By Clicking Slider

    Scenario: User should be navigated to iPhone 14 Pro Page

      Given Slider Shows iPhone Ad
      When User Tap Slider
      Then User is Navigated To iPhone Page




    Scenario: User should be navigated to Galaxy S22 Ultra Page

      Given Slider Shows Galaxy Ad
      When User Tap Galaxy Slider
      Then User is Navigated To Galaxy Page