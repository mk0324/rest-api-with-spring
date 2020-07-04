package me.cmung.demoinflearnrestapi.event;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.RepresentationModel;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;

public class EventResource extends EntityModel<Event> {

    public EventResource(Event event, Link... links) {
        super(event, links);
        //add(new Link("http://localhost:8080/api/events/" + event.getId()));
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }

}
