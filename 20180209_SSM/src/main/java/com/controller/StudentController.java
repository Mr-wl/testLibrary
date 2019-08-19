package com.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.po.Student;
import com.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Resource
	private StudentService service;
	@RequestMapping("/add")
	public String add(Student student,HttpServletRequest request){
		MultipartHttpServletRequest mulRequest=(MultipartHttpServletRequest) request;
		MultipartFile file = mulRequest.getFile("photo");
		if(file!=null && file.getSize()>0){
			String realPath = request.getServletContext().getRealPath("/upload/");
			File dir = new File(realPath);
			if(!dir.exists()){
				dir.mkdirs();
			}
			File destFile = new File(dir,file.getOriginalFilename());
			try {
				file.transferTo(destFile);
			    student.setPhotopath("upload/"+file.getOriginalFilename());
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		service.add(student);
		return "redirect:/student/list.do";
	}
	@RequestMapping("/list")
	public String list(Model model){
		List<Student> list=service.list();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/check")
	@ResponseBody
	public List<Student> check(){
		List<Student> list=service.getListGroup();
		List<Student> studentList=new ArrayList<Student>();
		for(int i=0;i<list.size();i++){
			List<Student> ls=service.getListByName(list.get(i).getName());
			studentList.addAll(ls);
		}
		return studentList;
		
	}
}
