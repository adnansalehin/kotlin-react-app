import React, { Component, Children } from 'react';
import $ from 'jquery';
import './App.css';
import Header from './components/Header';


class App extends Component {
  state = {
    pageHeader: "Hola",
    time: Date()
  };

  componentDidMount() {
    let st = [];
    $(".header").each(() => {
      st = ($(".header"));
    });
    console.log(st);
    $.ajax({
      context: this,
      url: "hello",
      method: "GET",
      data: {},
      success: function (data) {
        this.setState({pageHeader: data});
      },
      error: function (xhr, textStatus, error) {
        console.error("Reason: " + textStatus + " Status: " + xhr.status);
      },
      statusCode: {
        500: function (xhr) {
          alert("Internal server error has occurred");
          console.log(xhr);
        },
        404: function () {
          alert("Nothing found");
        },
        400: function () {
          alert("Bad request");
        },
      }
    });

  }

  render() {
    return (
      <div className="App">
      
        <Header 
        pageHeader={this.state.pageHeader}
        updater={this.updateText}
        ></Header>
        <p className="App-intro">
        children: {Children.count(this.props.children)}
          To get started, edit <code>src/App.js</code> and save to reload.
        </p>
      </div>
    );
  }
}

export default App;
