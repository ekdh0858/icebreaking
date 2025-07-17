const questions = [
            {
                text: "Q1. 새로운 학습 도구(AI, 온라인 플랫폼 등)가 소개되면 어떤 반응을 보이시나요?",
                options: [
                    { text: "🌟 바로 사용해보며 수업에 적용할 방법을 모색합니다.", value: 4 },
                    { text: "🔍 사용법을 찾아보고 흥미로우면 시도해봅니다.", value: 3 },
                    { text: "🤝 다른 튜터가 사용하는 것을 보고 괜찮으면 따라 합니다.", value: 2 },
                    { text: "🔄 기존에 사용하던 익숙한 도구를 선호합니다.", value: 1 }
                ]
            },
            {
                text: "Q2. 튜터링 자료 준비 시, 디지털 도구(템플릿, 그래픽 툴 등) 활용 빈도는?",
                options: [
                    { text: "✨ 대부분의 자료를 디지털 도구로 직접 제작하고 활용합니다.", value: 4 },
                    { text: "💻 필요한 경우에만 디지털 자료를 활용하거나 수정합니다.", value: 3 },
                    { text: "📄 기본적인 자료는 직접 만들고, 디지털 자료는 보조적으로 사용합니다.", value: 2 },
                    { text: "📝 주로 수기 자료나 인쇄물을 선호합니다.", value: 1 }
                ]
            },
            {
                text: "Q3. 학생 개개인의 학습 진도와 특성을 파악하기 위해 어떤 방식을 사용하나요?",
                options: [
                    { text: "📈 학습 관리 시스템(LMS)이나 온라인 도구를 적극 활용하여 데이터를 분석합니다.", value: 4 },
                    { text: "🗒️ 주요 내용은 디지털 기록으로 남기고, 수시로 피드백합니다.", value: 3 },
                    { text: "🗣️ 주로 대면 상담을 통해 학생의 상황을 파악하고 기억에 의존합니다.", value: 2 },
                    { text: "✏️ 간단한 메모나 인쇄물로만 관리합니다.", value: 1 }
                ]
            },
            {
                text: "Q4. 학생과의 소통 방식에서 디지털 채널(메신저, 이메일 등) 활용 비중은?",
                options: [
                    { text: "📱 주로 디지털 메신저나 플랫폼으로 실시간 소통 및 공지를 합니다.", value: 4 },
                    { text: "📧 중요한 공지나 자료 전달 시 디지털 채널을 활용합니다.", value: 3 },
                    { text: "📞 간단한 내용은 전화나 대면 소통을 선호하고, 디지털은 보조적입니다.", value: 2 },
                    { text: "🚫 디지털 소통은 거의 하지 않고 대면 만남을 중요시합니다.", value: 1 }
                ]
            },
            {
                text: "Q5. 튜터링 중 문제가 발생했을 때, 기술적인 해결 능력은 어느 정도인가요?",
                options: [
                    { text: "💡 스스로 검색하거나 해결책을 찾아 능숙하게 대처합니다.", value: 4 },
                    { text: "🤔 간단한 문제는 해결하지만, 복잡하면 도움을 요청합니다.", value: 3 },
                    { text: "🤷‍♀️ 기술적인 문제는 다른 사람에게 전적으로 의존하는 편입니다.", value: 2 },
                    { text: "🙅‍♀️ 기술 문제 해결 자체에 부담을 느낍니다.", value: 1 }
                ]
            },
            {
                text: "Q6. 새로운 튜터링 방법론이나 교육 트렌드에 대한 관심도는?",
                options: [
                    { text: "📚 관련 서적, 온라인 강의, 세미나를 찾아보며 적극적으로 학습합니다.", value: 4 },
                    { text: "📰 교육 관련 뉴스를 접하면 내용을 파악하고 적용을 고려합니다.", value: 3 },
                    { text: "👂 동료 튜터들과의 대화를 통해 정보를 얻는 편입니다.", value: 2 },
                    { text: "💤 특별히 관심을 두지 않고 기존 방식을 유지합니다.", value: 1 }
                ]
            },
            {
                text: "Q7. 학생들에게 학습 동기를 부여하기 위해 어떤 방법을 사용하나요?",
                options: [
                    { text: "🎮 게이미피케이션, 인터랙티브 퀴즈 등 디지털 요소를 적극 활용합니다.", value: 4 },
                    { text: "🌟 칭찬 스티커, 작은 보상 등 직접적인 피드백을 제공합니다.", value: 3 },
                    { text: "💬 주로 격려의 말이나 상담을 통해 동기를 부여합니다.", value: 2 },
                    { text: "🎯 학생들이 스스로 동기를 찾도록 기다리는 편입니다.", value: 1 }
                ]
            },
            {
                text: "Q8. 온라인 플랫폼으로 자료를 제공하나요?",
                options: [
                    { text: "🌐 플랫폼을 자주 활용해 공유합니다.", value: 4 },
                    { text: "📁 가끔 자료를 업로드합니다.", value: 3 },
                    { text: "📝 학습지 정도만 공유합니다.", value: 2 },
                    { text: "🚫 온라인 공유는 하지 않습니다.", value: 1 }
                ]
            },
            {
                text: "Q9. 디지털 격차가 있는 학생을 위해 어떤 노력을 하시나요?",
                options: [
                    { text: "💡 별도 안내와 보조자료를 제공하고 개별 지도를 합니다.", value: 4 },
                    { text: "🗣️ 친절하게 설명해주려 노력하며 이해를 돕습니다.", value: 3 },
                    { text: "📏 기본만 챙기려고 노력하며 큰 개입은 하지 않습니다.", value: 2 },
                    { text: "🤷‍♀️ 어쩔 수 없는 일이라 생각하며 크게 신경 쓰지 않습니다.", value: 1 }
                ]
            },
            {
                text: "Q10. 동료 튜터들에게 디지털 도구나 교육 노하우를 공유한 경험이 있나요?",
                options: [
                    { text: "🤝 적극적으로 먼저 제안하고, 필요하면 직접 가르쳐줍니다.", value: 4 },
                    { text: "🗣️ 유용한 정보를 알게 되면 공유하지만, 주도적이지는 않습니다.", value: 3 },
                    { text: "🤔 요청이 있으면 공유하지만, 먼저 나서지는 않습니다.", value: 2 },
                    { text: "🔒 개인적인 노하우는 잘 공유하지 않습니다.", value: 1 }
                ]
            }
        ];

        const results = {
            "디지털 마스터 튜터": {
                minScore: 36,
                maxScore: 40,
                desc: "당신은 최신 디지털 기술과 교육 트렌드를 능숙하게 활용하는 선도적인 튜터입니다. 변화를 두려워하지 않고, 학생들의 학습 경험을 혁신하기 위해 끊임없이 탐구하고 적용하는 진정한 교육 혁신가입니다. 당신의 역량은 다른 튜터들에게도 큰 영감을 줍니다!",
                icon: "psychology" // 또는 'rocket_launch', 'lightbulb'
            },
            "탐험가 튜터": {
                minScore: 28,
                maxScore: 35,
                desc: "새로운 학습 도구나 방법론에 대한 호기심이 많고, 시도해보는 것을 즐기는 튜터입니다. 꾸준히 자신을 발전시키고 학생들에게 더 나은 경험을 제공하기 위해 노력합니다. 앞으로 디지털 역량을 더욱 강화한다면 마스터 튜터로 성장할 수 있습니다!",
                icon: "explore" // 또는 'travel_explore', 'science'
            },
            "성장 중인 튜터": {
                minScore: 20,
                maxScore: 27,
                desc: "디지털 교육의 중요성을 인지하고 있으며, 변화에 적응하고 성장하기 위해 노력하고 있는 튜터입니다. 아직은 익숙하지 않지만, 배우려는 의지가 강하여 점진적으로 역량을 향상시킬 수 있습니다. 작은 시도부터 시작해보는 것이 좋습니다!",
                icon: "trending_up" // 또는 'school', 'emoji_objects'
            },
            "기본에 충실한 튜터": {
                minScore: 10,
                maxScore: 19,
                desc: "기존의 검증된 튜터링 방식에 능숙하고 안정적인 수업을 지향하는 튜터입니다. 디지털 도구 활용에 다소 익숙하지 않을 수 있지만, 튜터로서의 본질적인 역량은 충분합니다. 새로운 기술을 천천히 접목하며 학생들과의 소통 방식을 넓혀간다면 더욱 풍부한 튜터링이 가능할 것입니다.",
                icon: "bookmark" // 또는 'book', 'history_edu'
            }
        };

let currentQuestionIndex = 0;
let totalScore = 0;

const startContainer = document.getElementById("startContainer");
const startButton = document.getElementById("startButton");
const startScreenLogo = document.getElementById("startScreenLogo");
const quizScreenLogo = document.getElementById("quizScreenLogo");

const quizContainer = document.getElementById("quizContainer");
const resultContainer = document.getElementById("resultContainer");
const questionText = document.getElementById("questionText");
const optionList = document.getElementById("optionList");

function renderQuestion() {
  const progressText = document.getElementById("progressText");
  const progressBar = document.getElementById("progressBar");
  progressText.innerText = `${currentQuestionIndex + 1} / ${questions.length}`;
  const progressPercent = ((currentQuestionIndex + 1) / questions.length) * 100;
  progressBar.style.width = `${progressPercent}%`;

  const q = questions[currentQuestionIndex];
  questionText.innerText = q.text;
  optionList.innerHTML = "";

  q.options.forEach((opt, i) => {
    const optionDiv = document.createElement("div");
    optionDiv.className = "option-container";
    optionDiv.innerHTML = `
      <label class="mdl-radio mdl-js-radio mdl-js-ripple-effect" for="option-${i}">
        <input type="radio" id="option-${i}" class="mdl-radio__button" name="answer" value="${opt.value}" />
        <span class="mdl-radio__label">${opt.text}</span>
      </label>
    `;
    optionList.appendChild(optionDiv);

    optionDiv.addEventListener('click', () => {
      document.querySelectorAll('.option-container').forEach(div => div.classList.remove('selected'));
      optionDiv.classList.add('selected');

      const radio = optionDiv.querySelector('input[type="radio"]');
      radio.checked = true;

      totalScore += parseInt(radio.value);
      currentQuestionIndex++;

      setTimeout(() => {
        if (currentQuestionIndex < questions.length) {
          renderQuestion();
        } else {
          showResult();
        }
      }, 300);
    });
  });

  componentHandler.upgradeElements(optionList);
}

function showResult() {
  quizContainer.classList.add("hidden");
  resultContainer.classList.remove("hidden");
  quizScreenLogo.classList.add("hidden");

  const resultTypeElem = document.getElementById("resultType");
  const resultDescElem = document.getElementById("resultDesc");
  const resultIconElem = document.getElementById("resultIcon");

  for (const type in results) {
    const info = results[type];
    if (totalScore >= info.minScore && totalScore <= info.maxScore) {
      resultTypeElem.innerText = type;
      resultDescElem.innerText = info.desc;
      resultIconElem.innerText = info.icon;
      break;
    }
  }
}

function resetQuiz() {
  currentQuestionIndex = 0;
  totalScore = 0;
  quizContainer.classList.add("hidden");
  resultContainer.classList.add("hidden");
  startContainer.classList.remove("hidden");
  startScreenLogo.classList.remove("hidden");
  quizScreenLogo.classList.add("hidden");
}

startButton.addEventListener('click', () => {
  startContainer.classList.add("hidden");
  startScreenLogo.classList.add("hidden");
  quizContainer.classList.remove("hidden");
  quizScreenLogo.classList.remove("hidden");
  renderQuestion();
});
