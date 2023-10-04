package oit.is.z2144.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {
  @PostMapping("/janken")
  public String janken(@RequestParam String PlayerName, ModelMap model) {
    model.addAttribute("PlayerName", PlayerName);
    return "janken.html";
  }

  @PostMapping("/janken/start")
  public String game(@RequestParam String player_hand, ModelMap model) {
    String[] result_list = { "Draw", "You Win!!", "You Lose..." };
    String[] hand_list = { "グー", "チョキ", "パー" };
    String cpu_hand = hand_list[0];
    String result = "";

    if (player_hand.equals("グー")) {
      if (cpu_hand.equals("グー")) {
        result = result_list[0];
      } else if (cpu_hand.equals("チョキ")) {
        result = result_list[1];
      } else if (cpu_hand.equals("パー")) {
        result = result_list[2];
      }
    } else if (player_hand.equals("チョキ")) {
      if (cpu_hand.equals("グー")) {
        result = result_list[2];
      } else if (cpu_hand.equals("チョキ")) {
        result = result_list[0];
      } else if (cpu_hand.equals("パー")) {
        result = result_list[1];
      }
    } else if (player_hand.equals("パー")) {
      if (cpu_hand.equals("グー")) {
        result = result_list[1];
      } else if (cpu_hand.equals("チョキ")) {
        result = result_list[2];
      } else if (cpu_hand.equals("パー")) {
        result = result_list[0];
      }
    }
    model.addAttribute("player_hand", player_hand);
    model.addAttribute("cpu_hand", cpu_hand);
    model.addAttribute("result", result);
    return "janken.html";
  }
}
