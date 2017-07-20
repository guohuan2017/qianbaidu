package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.Comment;
import service.CommentService;

@Controller
public class CommentController {

	@Autowired
	private CommentService service;
}
