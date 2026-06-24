package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @GetMapping("/")
    public String home() {
        return """
<!doctype html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Paystack — Modern online and offline payments for Africa</title>
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css"
    />
    <style>
      *,
      *::before,
      *::after {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
      }

      :root {
        --green: #0dc07b;
        --dark-green: #0aa86c;
        --deep: #011b33;
        --nav-bg: #011b33;
        --hero-bg: #f0faf5;
        --text-dark: #011b33;
        --text-mid: #2d3748;
        --text-muted: #4a5568;
        --banner-bg: #011b33;
        --font:
          "Inter", -apple-system, BlinkMacSystemFont, "Segoe UI", sans-serif;
      }

      body {
        font-family: var(--font);
        background: #fff;
        color: var(--text-dark);
        overflow-x: hidden;
      }

      /* ── BANNER ── */
      .banner {
        background: var(--banner-bg);
        color: #fff;
        text-align: center;
        padding: 10px 20px;
        font-size: 13.5px;
        letter-spacing: 0.01em;
      }
      .banner a {
        color: #fff;
        text-decoration: none;
      }
      .banner .arrow {
        margin-left: 4px;
      }

      /* ── NAV ── */
      nav {
        background: #fff;
        border-bottom: 1px solid #e8f5f0;
        position: sticky;
        top: 0;
        z-index: 100;
        padding: 0 48px;
        display: flex;
        align-items: center;
        height: 64px;
        gap: 0;
      }

      .nav-logo {
        display: flex;
        align-items: center;
        gap: 8px;
        font-size: 20px;
        font-weight: 700;
        color: var(--text-dark);
        text-decoration: none;
        margin-right: 32px;
        flex-shrink: 0;
      }

      .logo-icon {
        width: 30px;
        height: 30px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        gap: 3px;
      }
      .logo-icon span {
        display: block;
        height: 4px;
        border-radius: 2px;
        background: var(--green);
      }
      .logo-icon span:nth-child(1) {
        width: 100%;
      }
      .logo-icon span:nth-child(2) {
        width: 70%;
      }
      .logo-icon span:nth-child(3) {
        width: 40%;
      }

      .nav-links {
        display: flex;
        align-items: center;
        gap: 4px;
        flex: 1;
        list-style: none;
      }
      .nav-links li a {
        display: flex;
        align-items: center;
        gap: 4px;
        padding: 8px 14px;
        font-size: 14px;
        font-weight: 500;
        color: var(--text-dark);
        text-decoration: none;
        border-radius: 6px;
        transition: background 0.15s;
      }
      .nav-links li a:hover {
        background: #f0faf5;
      }
      .nav-links li a i {
        font-size: 11px;
        opacity: 0.7;
      }

      .nav-right {
        display: flex;
        align-items: center;
        gap: 4px;
        margin-left: auto;
      }
      .nav-right a {
        padding: 8px 14px;
        font-size: 14px;
        font-weight: 500;
        color: var(--text-dark);
        text-decoration: none;
        border-radius: 6px;
        transition: background 0.15s;
        display: flex;
        align-items: center;
        gap: 4px;
      }
      .nav-right a:hover {
        background: #f0faf5;
      }
      .nav-right a i {
        font-size: 11px;
        opacity: 0.7;
      }

      .btn-cta-nav {
        background: var(--green) !important;
        color: #fff !important;
        padding: 10px 22px !important;
        border-radius: 8px !important;
        font-weight: 600 !important;
        transition: background 0.15s !important;
        margin-left: 4px;
      }
      .btn-cta-nav:hover {
        background: var(--dark-green) !important;
      }

      .flag-icon {
        font-size: 20px;
        margin-left: 6px;
        cursor: pointer;
      }

      /* ── HERO ── */
      .hero {
        background: var(--hero-bg);
        min-height: calc(100vh - 104px);
        display: grid;
        grid-template-columns: 1fr 1fr;
        position: relative;
        overflow: hidden;
      }

      .hero-left {
        padding: 80px 48px 80px 64px;
        display: flex;
        flex-direction: column;
        justify-content: center;
        position: relative;
        z-index: 2;
      }

      .hero-left h1 {
        font-size: clamp(36px, 4.5vw, 52px);
        font-weight: 800;
        line-height: 1.12;
        color: var(--text-dark);
        letter-spacing: -0.02em;
        margin-bottom: 22px;
        max-width: 520px;
      }

      .hero-left p {
        font-size: 17px;
        color: var(--text-muted);
        line-height: 1.6;
        margin-bottom: 36px;
        max-width: 400px;
      }

      .hero-actions {
        display: flex;
        align-items: center;
        gap: 20px;
        flex-wrap: wrap;
      }

      .btn-primary {
        background: var(--green);
        color: #fff;
        padding: 14px 28px;
        border-radius: 8px;
        font-size: 15px;
        font-weight: 600;
        text-decoration: none;
        border: none;
        cursor: pointer;
        transition:
          background 0.15s,
          transform 0.1s;
        display: inline-block;
      }
      .btn-primary:hover {
        background: var(--dark-green);
        transform: translateY(-1px);
      }

      .link-contact {
        font-size: 15px;
        color: var(--green);
        font-weight: 600;
        text-decoration: none;
        transition: opacity 0.15s;
      }
      .link-contact:hover {
        opacity: 0.8;
      }

      .hero-trusted {
        margin-top: 60px;
      }
      .hero-trusted p {
        font-size: 13px;
        color: var(--text-muted);
        margin-bottom: 16px;
        font-weight: 500;
        letter-spacing: 0.02em;
      }
      .trust-logos {
        display: flex;
        align-items: center;
        gap: 28px;
        flex-wrap: wrap;
      }
      .trust-logo {
        font-size: 15px;
        font-weight: 700;
        color: #1a202c;
        opacity: 0.75;
        display: flex;
        align-items: center;
        gap: 6px;
        letter-spacing: -0.01em;
      }
      .trust-logo .logo-diamond {
        width: 18px;
        height: 18px;
        background: #e53e3e;
        transform: rotate(45deg);
        border-radius: 2px;
      }
      .trust-logo.dominos {
        color: #006491;
      }
      .trust-logo.mtn {
        border: 2px solid #333;
        border-radius: 50%;
        padding: 2px 8px;
        font-size: 12px;
        font-weight: 800;
        color: #333;
      }
      .trust-logo.bolt {
        font-size: 17px;
        font-weight: 900;
        color: #1b1c1e;
        letter-spacing: -0.05em;
      }
      .trust-logo.axa {
        color: #00008f;
        font-size: 13px;
      }

      /* ── HERO MAP AREA ── */
      .hero-right {
        position: relative;
        display: flex;
        align-items: center;
        justify-content: center;
        overflow: hidden;
      }

      .map-svg {
        position: absolute;
        inset: 0;
        width: 100%;
        height: 100%;
      }

      /* Location dots on map */
      .map-dot {
        position: absolute;
        width: 42px;
        height: 42px;
        border-radius: 50%;
        background: #fff;
        border: 2px solid #d4f0e4;
        display: flex;
        align-items: center;
        justify-content: center;
        box-shadow: 0 2px 12px rgba(0, 150, 80, 0.12);
        cursor: pointer;
        transition: transform 0.2s;
      }
      .map-dot:hover {
        transform: scale(1.1);
      }
      .map-dot i {
        color: var(--green);
        font-size: 18px;
      }

      .map-dot.active {
        background: var(--deep);
        border-color: var(--deep);
      }
      .map-dot.active i {
        color: #fff;
      }

      /* Dot positions (approximate Africa map) */
      .dot-uk {
        top: 14%;
        right: 42%;
      }
      .dot-eg {
        top: 32%;
        right: 25%;
      }
      .dot-ng {
        top: 48%;
        right: 42%;
      }
      .dot-gh {
        top: 60%;
        right: 50%;
      }
      .dot-sa {
        top: 74%;
        right: 28%;
      }

      /* Video card */
      .video-card {
        position: absolute;
        bottom: 48px;
        right: 32px;
        background: rgba(255, 255, 255, 0.92);
        backdrop-filter: blur(8px);
        border-radius: 12px;
        padding: 16px 20px;
        display: flex;
        align-items: center;
        gap: 14px;
        max-width: 340px;
        box-shadow: 0 4px 24px rgba(0, 0, 0, 0.1);
        border: 1px solid #e8f5f0;
      }
      .video-card p {
        font-size: 13px;
        line-height: 1.45;
        color: var(--text-dark);
        font-weight: 500;
        margin: 0;
      }
      .play-btn {
        width: 44px;
        height: 44px;
        min-width: 44px;
        background: var(--green);
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        cursor: pointer;
        transition: background 0.15s;
        flex-shrink: 0;
      }
      .play-btn:hover {
        background: var(--dark-green);
      }
      .play-btn i {
        color: #fff;
        font-size: 15px;
        margin-left: 2px;
      }

      /* Africa map SVG dots path */
      .africa-path {
        fill: none;
        stroke: #b2e4cc;
        stroke-width: 1.5;
        stroke-dasharray: 4 4;
      }

      /* ── SECTION SHARED ── */
      .section-split {
        display: grid;
        grid-template-columns: 1fr 1fr;
        align-items: center;
        min-height: 560px;
      }
      .section-split.reverse {
        direction: rtl;
      }
      .section-split.reverse > * {
        direction: ltr;
      }

      .split-visual {
        background: #eaf6f1;
        min-height: 560px;
        display: flex;
        align-items: flex-end;
        justify-content: center;
        overflow: hidden;
        position: relative;
      }

      .split-content {
        padding: 72px 64px;
      }

      .section-eyebrow {
        font-size: 13px;
        font-weight: 600;
        letter-spacing: 0.08em;
        text-transform: uppercase;
        color: var(--green);
        margin-bottom: 18px;
      }

      .section-title {
        font-size: clamp(28px, 3.5vw, 40px);
        font-weight: 800;
        line-height: 1.15;
        letter-spacing: -0.02em;
        color: var(--text-dark);
        margin-bottom: 20px;
      }

      .section-body {
        font-size: 16px;
        line-height: 1.7;
        color: var(--text-muted);
        margin-bottom: 28px;
        max-width: 460px;
      }

      .check-list {
        list-style: none;
        display: grid;
        grid-template-columns: 1fr 1fr;
        gap: 12px 24px;
        margin-bottom: 0;
      }
      .check-list li {
        display: flex;
        align-items: center;
        gap: 8px;
        font-size: 15px;
        font-weight: 500;
        color: var(--text-dark);
      }
      .check-list li i {
        color: var(--green);
        font-size: 14px;
        flex-shrink: 0;
      }

      .check-list.single-col {
        grid-template-columns: 1fr;
      }
      .check-list.single-col li {
        font-size: 15.5px;
      }

      .section-link {
        display: inline-flex;
        align-items: center;
        gap: 8px;
        color: var(--green);
        font-weight: 600;
        font-size: 15px;
        text-decoration: none;
        margin-top: 28px;
        transition: gap 0.15s;
      }
      .section-link:hover {
        gap: 12px;
      }
      .section-link i {
        font-size: 16px;
      }

      /* ── SECTION 1: Simple easy payments ── */
      .sec-payments {
        padding: 80px 64px;
        background: #fff;
      }
      .sec-payments h2 {
        font-size: clamp(30px, 4vw, 44px);
        font-weight: 800;
        letter-spacing: -0.02em;
        color: var(--text-dark);
        margin-bottom: 12px;
      }
      .sec-payments > p {
        font-size: 16px;
        color: var(--text-muted);
        margin-bottom: 0;
      }

      /* Phone mockup */
      .phone-visual {
        background: #e8f5f0;
        min-height: 500px;
        display: flex;
        align-items: flex-end;
        justify-content: center;
        padding-bottom: 0;
        overflow: hidden;
      }

      .phone-hand {
        width: 260px;
        position: relative;
        bottom: -10px;
      }

      /* Nokia-style phone SVG */
      .phone-svg {
        width: 100%;
      }

      /* ── MERGED SECTION ── */
      .sec-merged {
        align-items: stretch;
      }
      .sec-merged .split-visual {
        min-height: 100%;
      }
      .merged-right {
        display: flex;
        flex-direction: column;
        justify-content: center;
        padding: 64px 64px;
      }
      .merged-block {
        flex: 1;
      }
      .merged-block .section-title {
        margin-bottom: 16px;
      }
      .merged-block .section-body {
        margin-bottom: 20px;
      }

      /* ── SECTION 3: APIs ── */
      .sec-apis .split-visual {
        background: #f5f8fa;
        align-items: center;
        padding: 40px;
      }

      .api-cards-visual {
        position: relative;
        width: 100%;
        height: 340px;
        display: flex;
        align-items: center;
        justify-content: center;
      }

      /* Stacked card illustration */
      .card-stack {
        position: relative;
        width: 280px;
        height: 220px;
      }
      .card-item {
        position: absolute;
        border-radius: 12px;
        box-shadow: 0 4px 20px rgba(0, 0, 0, 0.12);
      }

      /* ── TRUSTED BY section ── */
      .sec-trusted {
        background: #e8f4fb;
        padding: 72px 64px 80px;
        position: relative;
        overflow: hidden;
      }
      .sec-trusted::before {
        content: "";
        position: absolute;
        inset: 0;
        background-image: repeating-linear-gradient(
          135deg,
          transparent,
          transparent 40px,
          rgba(255, 255, 255, 0.18) 40px,
          rgba(255, 255, 255, 0.18) 41px
        );
        pointer-events: none;
      }
      .trusted-header {
        max-width: 520px;
        margin-bottom: 48px;
        position: relative;
      }
      .trusted-title {
        font-size: clamp(32px, 4vw, 46px);
        font-weight: 800;
        letter-spacing: -0.02em;
        color: var(--text-dark);
        line-height: 1.15;
        margin-bottom: 16px;
      }
      .trusted-sub {
        font-size: 16px;
        color: var(--text-muted);
        line-height: 1.6;
        max-width: 440px;
      }
      .trusted-cards {
        display: grid;
        grid-template-columns: repeat(3, 1fr);
        gap: 20px;
        position: relative;
      }
      .trusted-card {
        background: #fff;
        border-radius: 12px;
        padding: 28px 28px 24px;
        border: 1px solid #d8eaf4;
        display: flex;
        flex-direction: column;
      }
      .trusted-icon {
        margin-bottom: 20px;
      }
      .trusted-card-title {
        font-size: 17px;
        font-weight: 400;
        color: var(--text-dark);
        line-height: 1.4;
        margin-bottom: 12px;
      }
      .trusted-card-title strong {
        font-weight: 800;
        display: block;
      }
      .trusted-card-body {
        font-size: 14.5px;
        color: var(--text-muted);
        line-height: 1.6;
        flex: 1;
      }

      /* ── FOOTER ── */
      .site-footer {
        background: #fff;
        border-top: 1px solid #edf2f7;
        padding: 72px 64px 80px;
      }
      .footer-grid {
        display: grid;
        grid-template-columns: 1.3fr 1fr 1.1fr 1fr;
        gap: 48px;
      }
      .footer-heading {
        font-size: 15px;
        font-weight: 700;
        color: var(--text-dark);
        margin-bottom: 14px;
        letter-spacing: -0.01em;
      }
      .footer-links {
        list-style: none;
        margin-bottom: 20px;
      }
      .footer-links li {
        margin-bottom: 10px;
      }
      .footer-links a {
        font-size: 14px;
        color: var(--text-muted);
        text-decoration: none;
        line-height: 1.5;
        transition: color 0.15s;
      }
      .footer-links a:hover {
        color: var(--text-dark);
      }
      .footer-links--green a {
        color: var(--green);
      }
      .footer-links--green a:hover {
        color: var(--dark-green);
      }
      .footer-link--green {
        color: var(--green) !important;
      }

      @media (max-width: 900px) {
        .footer-grid {
          grid-template-columns: 1fr 1fr;
          gap: 32px;
        }
        .site-footer {
          padding: 48px 24px;
        }
      }
    </style>
  </head>
  <body>
    <!-- ANNOUNCEMENT BANNER -->
    <div class="banner">
      <a href="#"
        >🚀 Register your business and get a corporate bank account — fast
        <span class="arrow">→</span></a
      >
    </div>

    <!-- NAVIGATION -->
    <nav>
      <a href="#" class="nav-logo">
        <div class="logo-icon">
          <span></span>
          <span></span>
          <span></span>
        </div>
        chuks
      </a>

      <ul class="nav-links">
        <li>
          <a href="#">Why Paystack <i class="fa-solid fa-chevron-down"></i></a>
        </li>
        <li><a href="#">Customers</a></li>
        <li><a href="#">Pricing</a></li>
        <li>
          <a href="#">Learn <i class="fa-solid fa-chevron-down"></i></a>
        </li>
      </ul>

      <div class="nav-right">
        <a href="#">Developers <i class="fa-solid fa-chevron-down"></i></a>
        <a href="#">Support <i class="fa-solid fa-chevron-down"></i></a>
        <a href="#">Login</a>
        <a href="#" class="btn-cta-nav">Create free account</a>
        <span class="flag-icon">🇳🇬</span>
      </div>
    </nav>

    <!-- HERO -->
    <section class="hero">
      <!-- LEFT CONTENT -->
      <div class="hero-left">
        <h1>Modern online and offline payments for Africa</h1>
        <p>
          Paystack helps businesses in Africa get paid by anyone, anywhere in
          the world
        </p>

        <div class="hero-actions">
          <a href="#" class="btn-primary">Create a free account</a>
          <a href="#" class="link-contact">or Contact Sales</a>
        </div>

        <div class="hero-trusted">
          <p>Trusted by over 200,000 businesses</p>
          <div class="trust-logos">
            <div class="trust-logo dominos">
              <div class="logo-diamond"></div>
              Domino's
            </div>
            <div class="trust-logo mtn">MTN</div>
            <div class="trust-logo bolt">Bolt</div>
            <div class="trust-logo axa">
              <span
                style="
                  border: 2px solid #00008f;
                  padding: 2px 5px;
                  font-weight: 800;
                  font-size: 13px;
                "
                >AXA</span
              >
              &nbsp;MANSARD
            </div>
          </div>
        </div>
      </div>

      <!-- RIGHT MAP -->
      <div class="hero-right">
        <!-- Africa dot-grid map using SVG -->
        <svg
          class="map-svg"
          viewBox="0 0 600 700"
          xmlns="http://www.w3.org/2000/svg"
          preserveAspectRatio="xMidYMid slice"
        >
          <!-- Dot grid background simulating map -->
          <defs>
            <pattern
              id="dots"
              x="0"
              y="0"
              width="14"
              height="14"
              patternUnits="userSpaceOnUse"
            >
              <circle cx="2" cy="2" r="1.5" fill="#b2ddc8" opacity="0.7" />
            </pattern>
            <!-- Africa continent mask shape (simplified) -->
            <clipPath id="africa-clip">
              <path
                d="
            M 180 60
            C 220 45, 310 50, 360 70
            C 410 90, 450 100, 480 130
            C 510 160, 520 200, 510 240
            C 500 280, 480 290, 490 320
            C 500 350, 520 360, 510 400
            C 500 440, 460 480, 430 510
            C 400 540, 370 570, 340 590
            C 310 610, 290 615, 270 600
            C 250 585, 240 565, 220 540
            C 200 515, 190 490, 175 460
            C 160 430, 150 400, 145 370
            C 140 340, 145 310, 140 280
            C 135 250, 120 230, 115 200
            C 110 170, 120 140, 140 110
            C 155 85, 165 70, 180 60
            Z
          "
              />
            </clipPath>
            <!-- Europe/middle east simplified -->
            <clipPath id="europe-clip">
              <path
                d="
            M 100 0
            L 420 0
            L 500 100
            L 460 140
            L 430 130
            L 390 110
            L 360 70
            L 310 50
            L 220 45
            L 160 60
            L 130 50
            L 100 0 Z
          "
              />
            </clipPath>
          </defs>

          <!-- Africa continent dotted fill -->
          <rect
            x="0"
            y="0"
            width="600"
            height="700"
            fill="url(#dots)"
            clip-path="url(#africa-clip)"
          />

          <!-- Europe/north area dots lighter -->
          <rect
            x="0"
            y="0"
            width="600"
            height="160"
            fill="url(#dots)"
            opacity="0.4"
            clip-path="url(#europe-clip)"
          />

          <!-- Continent outline -->
          <path
            d="
        M 180 60
        C 220 45, 310 50, 360 70
        C 410 90, 450 100, 480 130
        C 510 160, 520 200, 510 240
        C 500 280, 480 290, 490 320
        C 500 350, 520 360, 510 400
        C 500 440, 460 480, 430 510
        C 400 540, 370 570, 340 590
        C 310 610, 290 615, 270 600
        C 250 585, 240 565, 220 540
        C 200 515, 190 490, 175 460
        C 160 430, 150 400, 145 370
        C 140 340, 145 310, 140 280
        C 135 250, 120 230, 115 200
        C 110 170, 120 140, 140 110
        C 155 85, 165 70, 180 60 Z
      "
            fill="none"
            stroke="#8ecfb0"
            stroke-width="1"
          />

          <!-- Location pin circles -->

          <!-- UK / Europe pin -->
          <g transform="translate(230, 80)">
            <circle r="22" fill="white" stroke="#c8e8d8" stroke-width="1.5" />
            <circle r="20" fill="white" />
            <!-- Checkmark icon -->
            <path
              d="M-7,1 L-2,6 L8,-5"
              fill="none"
              stroke="#0DC07B"
              stroke-width="2.5"
              stroke-linecap="round"
              stroke-linejoin="round"
            />
          </g>

          <!-- Egypt / north africa pin -->
          <g transform="translate(400, 220)">
            <circle r="22" fill="white" stroke="#c8e8d8" stroke-width="1.5" />
            <circle r="20" fill="white" />
            <path
              d="M-7,1 L-2,6 L8,-5"
              fill="none"
              stroke="#0DC07B"
              stroke-width="2.5"
              stroke-linecap="round"
              stroke-linejoin="round"
            />
          </g>

          <!-- Nigeria (active) - central west africa -->
          <g transform="translate(260, 340)">
            <circle r="26" fill="#011B33" stroke="#011B33" stroke-width="1.5" />
            <!-- Message icon -->
            <rect
              x="-10"
              y="-7"
              width="20"
              height="14"
              rx="3"
              fill="none"
              stroke="white"
              stroke-width="2"
            />
            <path
              d="M-10,4 L-6,10 L0,4"
              fill="none"
              stroke="white"
              stroke-width="1.8"
            />
          </g>

          <!-- Ghana / West Africa lower pin -->
          <g transform="translate(195, 420)">
            <circle r="22" fill="white" stroke="#c8e8d8" stroke-width="1.5" />
            <circle r="20" fill="white" />
            <path
              d="M-7,1 L-2,6 L8,-5"
              fill="none"
              stroke="#0DC07B"
              stroke-width="2.5"
              stroke-linecap="round"
              stroke-linejoin="round"
            />
          </g>

          <!-- South Africa pin -->
          <g transform="translate(340, 530)">
            <circle r="22" fill="white" stroke="#c8e8d8" stroke-width="1.5" />
            <circle r="20" fill="white" />
            <path
              d="M-7,1 L-2,6 L8,-5"
              fill="none"
              stroke="#0DC07B"
              stroke-width="2.5"
              stroke-linecap="round"
              stroke-linejoin="round"
            />
          </g>
        </svg>

        <!-- Video Card overlay -->
        <div class="video-card">
          <p>
            Watch MTN Chief Transformation Officer, Olubayo Adekanmbi, discuss
            working with Paystack
          </p>
          <div class="play-btn">
            <i class="fa-solid fa-play"></i>
          </div>
        </div>
      </div>
    </section>

    <!-- ══════════════════════════════════════════════
     SECTION: Simple easy payments MERGED
════════════════════════════════════════════════ -->
    <div class="sec-payments">
      <h2>Simple, easy payments</h2>
      <p>Building a business is hard. Getting paid shouldn't be.</p>
    </div>

    <section class="section-split sec-merged">
      <!-- LEFT: Phone visual (spans both content blocks) -->
      <div class="split-visual phone-visual">
        <svg
          class="phone-hand"
          viewBox="0 0 260 420"
          xmlns="http://www.w3.org/2000/svg"
        >
          <ellipse cx="130" cy="390" rx="80" ry="50" fill="#c8956c" />
          <rect
            x="80"
            y="240"
            width="100"
            height="160"
            rx="20"
            fill="#c8956c"
          />
          <rect x="82" y="200" width="22" height="70" rx="11" fill="#c8956c" />
          <rect x="110" y="185" width="22" height="75" rx="11" fill="#c8956c" />
          <rect x="138" y="188" width="22" height="72" rx="11" fill="#c8956c" />
          <rect x="164" y="200" width="18" height="60" rx="9" fill="#c8956c" />
          <rect
            x="52"
            y="255"
            width="18"
            height="55"
            rx="9"
            fill="#c8956c"
            transform="rotate(-15 61 282)"
          />
          <rect x="88" y="50" width="86" height="165" rx="10" fill="#2d3748" />
          <rect x="93" y="62" width="76" height="100" rx="4" fill="#1a202c" />
          <rect
            x="95"
            y="64"
            width="72"
            height="96"
            rx="3"
            fill="#232f3e"
            opacity="0.8"
          />
          <rect x="116" y="56" width="30" height="4" rx="2" fill="#4a5568" />
          <rect x="93" y="170" width="76" height="38" rx="4" fill="#3d4a5c" />
          <rect x="97" y="173" width="18" height="8" rx="2" fill="#4a5568" />
          <rect x="119" y="173" width="18" height="8" rx="2" fill="#4a5568" />
          <rect x="141" y="173" width="18" height="8" rx="2" fill="#4a5568" />
          <rect x="97" y="185" width="18" height="8" rx="2" fill="#4a5568" />
          <rect x="119" y="185" width="18" height="8" rx="2" fill="#4a5568" />
          <rect x="141" y="185" width="18" height="8" rx="2" fill="#4a5568" />
          <text
            x="131"
            y="98"
            text-anchor="middle"
            font-size="8"
            fill="#8899aa"
            font-family="Arial"
          >
            NOKIA
          </text>
        </svg>
      </div>

      <!-- RIGHT: Both content blocks stacked vertically -->
      <div class="split-content merged-right">
        <!-- Block 1: Delight customers -->
        <div class="merged-block">
          <h2 class="section-title">
            Delight customers with a seamless payments experience
          </h2>
          <p class="section-body">
            Give your customers the gift of modern, frictionless, painless
            payments. Integrate Paystack once and let your customers pay you
            however they want.
          </p>
          <ul class="check-list">
            <li><i class="fa-solid fa-check"></i> Card</li>
            <li><i class="fa-solid fa-check"></i> Apple Pay</li>
            <li><i class="fa-solid fa-check"></i> Bank Account</li>
            <li><i class="fa-solid fa-check"></i> Visa QR</li>
            <li><i class="fa-solid fa-check"></i> Bank Transfer</li>
            <li><i class="fa-solid fa-check"></i> Mobile Money</li>
            <li><i class="fa-solid fa-check"></i> USSD</li>
            <li><i class="fa-solid fa-check"></i> POS</li>
          </ul>
        </div>

        <!-- Divider line -->
        <div style="border-top: 1px solid #e2e8f0; margin: 36px 0"></div>

        <!-- Block 2: Transaction success rates -->
        <div class="merged-block">
          <h2 class="section-title">
            Enjoy phenomenal transaction success rates
          </h2>
          <p class="section-body">
            We automatically route payments through the most optimal channels,
            ensuring the highest transaction success rates in the market.
          </p>
          <a href="#" class="section-link">
            <i class="fa-regular fa-circle-right"></i>
            Find out how we achieve high success rates
          </a>
        </div>
      </div>
    </section>

    <!-- ══════════════════════════════════════════════
     SECTION: Build custom payments with APIs
════════════════════════════════════════════════ -->
    <section class="section-split sec-apis">
      <!-- LEFT: Content -->
      <div class="split-content">
        <h2 class="section-title">
          Build custom payments experiences with well-documented APIs
        </h2>
        <p class="section-body">
          Developers love our thorough, well-documented APIs that let you to
          build everything from simple weekend projects, to complex financial
          products serving hundreds of thousands of customers. If you can
          imagine it, you can build it with Paystack.
        </p>
        <ul class="check-list single-col">
          <li>
            <i class="fa-solid fa-check"></i> Collect one-time and recurring
            payments from your app or website
          </li>
          <li><i class="fa-solid fa-check"></i> Make instant transfers</li>
          <li>
            <i class="fa-solid fa-check"></i> Retrieve all your transaction and
            customer data
          </li>
          <li>
            <i class="fa-solid fa-check"></i> Verify the identity of customers
          </li>
        </ul>
        <a href="#" class="section-link">
          <i class="fa-regular fa-circle-right"></i>
          Paystack API Quickstart
        </a>
      </div>

      <!-- RIGHT: Card stack illustration -->
      <div
        class="split-visual sec-apis-visual"
        style="
          background: #f5f8fa;
          padding: 40px;
          align-items: center;
          justify-content: center;
        "
      >
        <svg
          viewBox="0 0 380 360"
          xmlns="http://www.w3.org/2000/svg"
          style="width: 100%; max-width: 400px"
        >
          <!-- Background card (light gray) -->
          <rect x="60" y="30" width="260" height="180" rx="10" fill="#dce8f0" />

          <!-- Dark navy tilted card (main credit card) -->
          <g transform="rotate(-12 240 80)">
            <rect
              x="155"
              y="10"
              width="160"
              height="110"
              rx="10"
              fill="#1a2e45"
            />
            <!-- Card shine stripe -->
            <rect
              x="155"
              y="50"
              width="160"
              height="18"
              fill="#243b57"
              opacity="0.7"
            />
            <!-- Cyan chip accent -->
            <rect x="245" y="18" width="30" height="22" rx="4" fill="#00bcd4" />
            <!-- Small dark square -->
            <rect x="280" y="18" width="18" height="18" rx="3" fill="#0d1f2d" />
          </g>

          <!-- Code editor mockup below -->
          <rect x="40" y="175" width="300" height="130" rx="8" fill="#e8eef2" />
          <!-- Editor header bar -->
          <rect x="40" y="175" width="300" height="20" rx="8" fill="#d0dce6" />
          <rect x="40" y="187" width="300" height="8" fill="#d0dce6" />
          <!-- Code lines -->
          <rect x="56" y="208" width="80" height="8" rx="3" fill="#b0c4d4" />
          <rect x="56" y="222" width="120" height="8" rx="3" fill="#b0c4d4" />
          <rect x="56" y="236" width="60" height="8" rx="3" fill="#b0c4d4" />
          <rect x="56" y="250" width="100" height="8" rx="3" fill="#b0c4d4" />
          <rect x="56" y="264" width="140" height="8" rx="3" fill="#b0c4d4" />
          <rect x="56" y="278" width="70" height="8" rx="3" fill="#b0c4d4" />

          <!-- Colorful block columns (bottom decoration) -->
          <!-- Column 1 - dark navy -->
          <rect x="40" y="310" width="48" height="50" rx="5" fill="#1a2e45" />
          <rect x="44" y="306" width="12" height="10" rx="3" fill="#00bcd4" />
          <!-- Column 2 - light blue -->
          <rect x="96" y="295" width="48" height="65" rx="5" fill="#b8d4e8" />
          <rect x="100" y="291" width="12" height="10" rx="3" fill="#1a2e45" />
          <!-- Column 3 - dark navy -->
          <rect x="152" y="305" width="48" height="55" rx="5" fill="#1a2e45" />
          <rect x="156" y="301" width="12" height="10" rx="3" fill="#00bcd4" />
          <!-- Column 4 - gold/amber -->
          <rect x="208" y="290" width="48" height="70" rx="5" fill="#d4a017" />
          <rect x="212" y="286" width="12" height="10" rx="3" fill="#b8860b" />
          <!-- Column 5 - light yellow -->
          <rect x="264" y="300" width="48" height="60" rx="5" fill="#f0e08c" />
          <rect x="268" y="296" width="12" height="10" rx="3" fill="#d4a017" />
          <!-- Green accent at bottom -->
          <rect x="152" y="346" width="48" height="14" rx="3" fill="#2e7d52" />
          <!-- Blue accent bottom right -->
          <rect x="304" y="340" width="36" height="20" rx="3" fill="#1565c0" />
        </svg>
      </div>
    </section>

    <!-- ══════════════════════════════════════════════
     SECTION: Fraud detection + Reporting (merged, radar visual left)
════════════════════════════════════════════════ -->
    <section class="section-split sec-fraud">
      <!-- LEFT: Radar visual -->
      <div
        class="split-visual"
        style="
          background: #0a1628;
          min-height: 520px;
          display: flex;
          align-items: center;
          justify-content: center;
          padding: 40px;
        "
      >
        <svg
          viewBox="0 0 400 400"
          xmlns="http://www.w3.org/2000/svg"
          style="width: 100%; max-width: 380px"
        >
          <!-- Outer dark background panels -->
          <rect x="0" y="0" width="400" height="400" rx="10" fill="#0a1628" />
          <!-- Subtle background rectangles (like UI cards) -->
          <rect
            x="240"
            y="30"
            width="130"
            height="80"
            rx="6"
            fill="#112240"
            opacity="0.7"
          />
          <rect
            x="240"
            y="120"
            width="130"
            height="50"
            rx="6"
            fill="#112240"
            opacity="0.5"
          />
          <rect
            x="10"
            y="320"
            width="160"
            height="60"
            rx="6"
            fill="#112240"
            opacity="0.6"
          />
          <rect
            x="240"
            y="310"
            width="150"
            height="70"
            rx="6"
            fill="#112240"
            opacity="0.5"
          />
          <!-- Stars/particles -->
          <circle cx="50" cy="50" r="1.5" fill="#ffffff" opacity="0.4" />
          <circle cx="80" cy="20" r="1" fill="#ffffff" opacity="0.3" />
          <circle cx="340" cy="60" r="1.5" fill="#ffffff" opacity="0.4" />
          <circle cx="370" cy="180" r="1" fill="#ffffff" opacity="0.3" />
          <circle cx="30" cy="200" r="1" fill="#ffffff" opacity="0.3" />
          <circle cx="20" cy="300" r="1.5" fill="#ffffff" opacity="0.4" />
          <circle cx="360" cy="350" r="1" fill="#ffffff" opacity="0.3" />
          <!-- Radar circles -->
          <circle
            cx="185"
            cy="200"
            r="160"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="0.8"
            opacity="0.4"
          />
          <circle
            cx="185"
            cy="200"
            r="135"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="0.8"
            opacity="0.4"
          />
          <circle
            cx="185"
            cy="200"
            r="110"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="0.8"
            opacity="0.4"
          />
          <circle
            cx="185"
            cy="200"
            r="85"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="0.9"
            opacity="0.5"
          />
          <circle
            cx="185"
            cy="200"
            r="60"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="0.9"
            opacity="0.5"
          />
          <circle
            cx="185"
            cy="200"
            r="35"
            fill="none"
            stroke="#1a9e5c"
            stroke-width="1"
            opacity="0.6"
          />
          <!-- Radar grid lines (crosshair) -->
          <line
            x1="185"
            y1="40"
            x2="185"
            y2="360"
            stroke="#1a9e5c"
            stroke-width="0.8"
            opacity="0.4"
          />
          <line
            x1="25"
            y1="200"
            x2="345"
            y2="200"
            stroke="#1a9e5c"
            stroke-width="0.8"
            opacity="0.4"
          />
          <line
            x1="72"
            y1="87"
            x2="298"
            y2="313"
            stroke="#1a9e5c"
            stroke-width="0.6"
            opacity="0.3"
          />
          <line
            x1="298"
            y1="87"
            x2="72"
            y2="313"
            stroke="#1a9e5c"
            stroke-width="0.6"
            opacity="0.3"
          />
          <!-- Radar fill (green circle) -->
          <circle cx="185" cy="200" r="160" fill="#0DC07B" opacity="0.18" />
          <circle cx="185" cy="200" r="130" fill="#0DC07B" opacity="0.18" />
          <circle cx="185" cy="200" r="100" fill="#0DC07B" opacity="0.18" />
          <circle cx="185" cy="200" r="70" fill="#0DC07B" opacity="0.18" />
          <!-- Radar sweep (bright wedge) -->
          <path
            d="M185,200 L185,40 A160,160 0 0,1 330,290 Z"
            fill="#0DC07B"
            opacity="0.22"
          />
          <path
            d="M185,200 L185,40 A160,160 0 0,1 330,290 Z"
            fill="url(#radarGrad)"
            opacity="0.3"
          />
          <defs>
            <radialGradient id="radarGrad" cx="50%" cy="50%" r="50%">
              <stop offset="0%" stop-color="#0DC07B" stop-opacity="0.6" />
              <stop offset="100%" stop-color="#0DC07B" stop-opacity="0" />
            </radialGradient>
          </defs>
          <!-- Center dot -->
          <circle cx="185" cy="200" r="5" fill="#0DC07B" opacity="0.9" />
          <circle cx="185" cy="200" r="2" fill="#ffffff" />
        </svg>
      </div>

      <!-- RIGHT: Two content blocks -->
      <div class="split-content merged-right">
        <div class="merged-block">
          <h2 class="section-title">
            Protect yourself and your customers with advanced fraud detection
          </h2>
          <p class="section-body">
            Paystack's combination of automated and manual fraud systems protect
            you from fraudulent transactions and associated chargeback claims.
          </p>
        </div>

        <div style="border-top: 1px solid #e2e8f0; margin: 36px 0"></div>

        <div class="merged-block">
          <h2 class="section-title">
            Detailed reporting for accounting, reconciliation, and audits
          </h2>
          <p class="section-body">
            Understand your customers' purchase patterns and do easy
            reconciliations with a robust data Dashboard and easy exports.
          </p>
        </div>
      </div>
    </section>

    <!-- ══════════════════════════════════════════════
     SECTION: Trusted by 200,000+ businesses
════════════════════════════════════════════════ -->
    <section class="sec-trusted">
      <div class="trusted-header">
        <h2 class="trusted-title">Trusted by 200,000+<br />businesses</h2>
        <p class="trusted-sub">
          Thousands of organizations of all sizes trust Paystack to grow their
          business.
        </p>
      </div>

      <div class="trusted-cards">
        <!-- Card 1: Global Brands -->
        <div class="trusted-card">
          <div class="trusted-icon">
            <svg
              viewBox="0 0 80 70"
              xmlns="http://www.w3.org/2000/svg"
              width="80"
              height="70"
            >
              <!-- Globe base circle -->
              <circle cx="30" cy="38" r="24" fill="#dce8f5" />
              <circle
                cx="30"
                cy="38"
                r="24"
                fill="none"
                stroke="#b0c8e8"
                stroke-width="1"
              />
              <!-- Globe meridians -->
              <ellipse
                cx="30"
                cy="38"
                rx="10"
                ry="24"
                fill="none"
                stroke="#b0c8e8"
                stroke-width="1"
              />
              <line
                x1="6"
                y1="38"
                x2="54"
                y2="38"
                stroke="#b0c8e8"
                stroke-width="1"
              />
              <line
                x1="10"
                y1="26"
                x2="50"
                y2="26"
                stroke="#b0c8e8"
                stroke-width="0.8"
              />
              <line
                x1="10"
                y1="50"
                x2="50"
                y2="50"
                stroke="#b0c8e8"
                stroke-width="0.8"
              />
              <!-- Location pin -->
              <circle cx="34" cy="34" r="6" fill="#0DC07B" />
              <circle cx="34" cy="34" r="3" fill="#fff" />
              <!-- Small flag accent -->
              <rect x="50" y="14" width="3" height="14" fill="#011B33" />
              <rect x="53" y="14" width="12" height="8" fill="#0DC07B" />
              <!-- Small blue square accent -->
              <rect x="56" y="26" width="8" height="8" rx="1" fill="#1a6fc4" />
            </svg>
          </div>
          <h3 class="trusted-card-title">
            Paystack for<br /><strong>Global Brands</strong>
          </h3>
          <p class="trusted-card-body">
            We help global brands accept payments from across Africa
          </p>
          <a
            href="#"
            class="section-link"
            style="margin-top: 16px; font-size: 14px"
          >
            <i class="fa-regular fa-circle-right"></i> Learn More
          </a>
        </div>

        <!-- Card 2: Entrepreneurs -->
        <div class="trusted-card">
          <div class="trusted-icon">
            <svg
              viewBox="0 0 80 70"
              xmlns="http://www.w3.org/2000/svg"
              width="80"
              height="70"
            >
              <!-- House base -->
              <rect
                x="14"
                y="34"
                width="38"
                height="28"
                rx="2"
                fill="#dce8f5"
              />
              <!-- Roof -->
              <polygon points="10,36 33,14 56,36" fill="#b0c8e8" />
              <!-- Door -->
              <rect
                x="27"
                y="46"
                width="12"
                height="16"
                rx="2"
                fill="#011B33"
              />
              <!-- Sunglasses accent -->
              <ellipse cx="50" cy="42" rx="8" ry="5" fill="#1a202c" />
              <ellipse cx="64" cy="42" rx="8" ry="5" fill="#1a202c" />
              <line
                x1="58"
                y1="42"
                x2="56"
                y2="42"
                stroke="#1a202c"
                stroke-width="2"
              />
              <!-- Colored block -->
              <rect x="54" y="52" width="8" height="10" rx="1" fill="#0DC07B" />
              <rect x="62" y="55" width="8" height="7" rx="1" fill="#f0a500" />
            </svg>
          </div>
          <h3 class="trusted-card-title">
            Paystack for<br /><strong>Entrepreneurs</strong>
          </h3>
          <p class="trusted-card-body" style="color: var(--green)">
            From startup to scale-up, we can support you at every stage of your
            businesses' growth
          </p>
          <a
            href="#"
            class="section-link"
            style="margin-top: 16px; font-size: 14px"
          >
            <i class="fa-regular fa-circle-right"></i> Learn More
          </a>
        </div>

        <!-- Card 3: Large Organizations -->
        <div class="trusted-card">
          <div class="trusted-icon">
            <svg
              viewBox="0 0 80 70"
              xmlns="http://www.w3.org/2000/svg"
              width="80"
              height="70"
            >
              <!-- Buildings -->
              <rect x="8" y="28" width="22" height="34" rx="2" fill="#dce8f5" />
              <rect
                x="32"
                y="18"
                width="26"
                height="44"
                rx="2"
                fill="#b0c8e8"
              />
              <!-- Windows -->
              <rect x="12" y="32" width="6" height="6" rx="1" fill="#b0c8e8" />
              <rect x="20" y="32" width="6" height="6" rx="1" fill="#b0c8e8" />
              <rect x="12" y="42" width="6" height="6" rx="1" fill="#b0c8e8" />
              <rect x="20" y="42" width="6" height="6" rx="1" fill="#b0c8e8" />
              <rect x="36" y="24" width="6" height="6" rx="1" fill="#dce8f5" />
              <rect x="46" y="24" width="6" height="6" rx="1" fill="#dce8f5" />
              <rect x="36" y="34" width="6" height="6" rx="1" fill="#dce8f5" />
              <rect x="46" y="34" width="6" height="6" rx="1" fill="#dce8f5" />
              <!-- Flag on top -->
              <rect x="42" y="8" width="2" height="12" fill="#011B33" />
              <rect x="44" y="8" width="12" height="7" fill="#0DC07B" />
              <!-- Ground line accent -->
              <rect x="4" y="62" width="72" height="3" rx="1" fill="#e2e8f0" />
            </svg>
          </div>
          <h3 class="trusted-card-title">
            Paystack for<br /><strong>Large Organizations</strong>
          </h3>
          <p class="trusted-card-body" style="color: var(--green)">
            Paystack helps many of the largest corporate and government
            organizations in Nigeria get paid quickly and securely.
          </p>
          <a
            href="#"
            class="section-link"
            style="margin-top: 16px; font-size: 14px"
          >
            <i class="fa-regular fa-circle-right"></i> Learn More
          </a>
        </div>
      </div>
    </section>

    <!-- ══════════════════════════════════════════════
     FOOTER
════════════════════════════════════════════════ -->
    <footer class="site-footer">
      <div class="footer-grid">
        <!-- Column 1: Why Paystack -->
        <div class="footer-col">
          <h4 class="footer-heading">Why Paystack</h4>
          <ul class="footer-links">
            <li><a href="#">Why Choose Paystack</a></li>
            <li><a href="#">Success Rates</a></li>
          </ul>
          <ul class="footer-links footer-links--green">
            <li><a href="#">For Entrepreneurs</a></li>
            <li><a href="#">For Corporates</a></li>
            <li><a href="#">For International Companies</a></li>
            <li><a href="#">For Startups</a></li>
          </ul>
          <ul class="footer-links footer-links--green">
            <li><a href="#">For Fintechs</a></li>
            <li><a href="#">For Agencies</a></li>
            <li><a href="#">For Schools</a></li>
            <li><a href="#">For Betting</a></li>
          </ul>
        </div>

        <!-- Column 2: Pricing + Customers + Learn -->
        <div class="footer-col">
          <h4 class="footer-heading">Pricing</h4>
          <ul class="footer-links footer-links--green">
            <li><a href="#">Nigeria</a></li>
            <li><a href="#">Ghana</a></li>
            <li><a href="#">South Africa</a></li>
            <li><a href="#">Kenya</a></li>
            <li><a href="#">Côte D'Ivoire</a></li>
          </ul>

          <h4 class="footer-heading" style="margin-top: 28px">Customers</h4>
          <ul class="footer-links footer-links--green">
            <li><a href="#">Testimonials</a></li>
          </ul>

          <h4 class="footer-heading" style="margin-top: 28px">Learn</h4>
          <ul class="footer-links footer-links--green">
            <li><a href="#">Blog</a></li>
            <li><a href="#">Guides</a></li>
            <li><a href="#">Video Tutorials</a></li>
            <li><a href="#">Decode Fintech</a></li>
            <li><a href="#">Commerce</a></li>
            <li><a href="#">Terminal</a></li>
          </ul>
        </div>

        <!-- Column 3: Developers + Community + Support -->
        <div class="footer-col">
          <h4 class="footer-heading">Developers</h4>
          <ul class="footer-links">
            <li><a href="#">Overview</a></li>
            <li><a href="#">Documentation</a></li>
            <li><a href="#">Integrations</a></li>
            <li><a href="#">Status Page</a></li>
          </ul>

          <h4 class="footer-heading" style="margin-top: 28px">Community</h4>
          <ul class="footer-links">
            <li><a href="#">Service Partner Directory</a></li>
            <li><a href="#">Nigeria Logos</a></li>
          </ul>

          <h4 class="footer-heading" style="margin-top: 28px">Support</h4>
          <ul class="footer-links">
            <li><a href="#">Help Desk</a></li>
            <li><a href="#">Contact Us</a></li>
            <li><a href="#">Why Was I Debited?</a></li>
            <li><a href="#">Register Your Business</a></li>
          </ul>
        </div>

        <!-- Column 4: About -->
        <div class="footer-col">
          <h4 class="footer-heading">About</h4>
          <ul class="footer-links">
            <li><a href="#">Company</a></li>
            <li><a href="#">Changelog</a></li>
            <li><a href="#">Subscribe</a></li>
            <li><a href="#">Compliance</a></li>
            <li><a href="#">Careers</a></li>
            <li><a href="#" class="footer-link--green">Media Kit</a></li>
            <li><a href="#">Privacy &amp; Terms</a></li>
            <li><a href="#">Cookies Settings</a></li>
          </ul>
        </div>
      </div>
    </footer>

    <script></script>
  </body>
</html>
        """;
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
