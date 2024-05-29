package com.example.flashcards.designpatterns.model

import com.example.flashcards.designpatterns.R

object DesignPatternsRepository {
    val designPatterns = listOf(
        //Creational patterns
        DesignPattern(
            name = R.string.abstract_factory,
            description = R.string.abstract_factory_description,
            url = R.string.abstract_factory_url,
            type = PatternType.CREATIONAL
        ),
        DesignPattern(
            name = R.string.builder,
            description = R.string.builder_description,
            url = R.string.builder_url,
            type = PatternType.CREATIONAL
        ),
        DesignPattern(
            name = R.string.factory_method,
            description = R.string.factory_method_description,
            url = R.string.factory_method_url,
            type = PatternType.CREATIONAL
        ),
        DesignPattern(
            name = R.string.prototype,
            description = R.string.prototype_description,
            url = R.string.prototype_url,
            type = PatternType.CREATIONAL
        ),
        DesignPattern(
            name = R.string.singleton,
            description = R.string.singleton_description,
            url = R.string.singleton_url,
            type = PatternType.CREATIONAL
        ),
        //Structural patterns
        DesignPattern(
            name = R.string.adapter,
            description = R.string.adapter_description,
            url = R.string.adapter_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.bridge,
            description = R.string.bridge_description,
            url = R.string.bridge_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.composite,
            description = R.string.composite_description,
            url = R.string.composite_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.decorator,
            description = R.string.decorator_description,
            url = R.string.decorator_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.facade,
            description = R.string.facade_description,
            url = R.string.facade_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.flyweight,
            description = R.string.flyweight_description,
            url = R.string.flyweight_url,
            type = PatternType.STRUCTURAL
        ),
        DesignPattern(
            name = R.string.proxy,
            description = R.string.proxy_description,
            url = R.string.proxy_url,
            type = PatternType.STRUCTURAL
        ),
        //Behavioral patterns
        DesignPattern(
            name = R.string.chain_of_responsibility,
            description = R.string.chain_of_responsibility_description,
            url = R.string.chain_of_responsibility_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.command,
            description = R.string.command_description,
            url = R.string.command_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.interpreter,
            description = R.string.interpreter_description,
            url = R.string.interpreter_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.iterator,
            description = R.string.iterator_description,
            url = R.string.iterator_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.mediator,
            description = R.string.mediator_description,
            url = R.string.mediator_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.memento,
            description = R.string.memento_description,
            url = R.string.memento_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.observer,
            description = R.string.observer_description,
            url = R.string.observer_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.state,
            description = R.string.state_description,
            url = R.string.state_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.strategy,
            description = R.string.strategy_description,
            url = R.string.strategy_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.template_method,
            description = R.string.template_method_description,
            url = R.string.template_method_url,
            type = PatternType.BEHAVIORAL
        ),
        DesignPattern(
            name = R.string.visitor,
            description = R.string.visitor_description,
            url = R.string.visitor_url,
            type = PatternType.BEHAVIORAL
        )
    )
}