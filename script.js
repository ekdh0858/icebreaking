function startQuiz() {
  document.getElementById('intro').style.display = 'none';
  document.getElementById('quiz').style.display = 'block';
}

function restartQuiz() {
  window.location.reload();
}

document.getElementById('quizForm').addEventListener('submit', function(e) {
  e.preventDefault();

  const form = e.target;
  const formData = new FormData(form);
  let total = 0;
  for (let [_, value] of formData.entries()) {
    total += parseInt(value);
  }

  let type = '';
  let desc = '';
  if (total >= 28) {
    type = '디지털 마이스터';
    desc = '기술 도입에 적극적이고, 동료 교사에게 영감을 줍니다.';
  } else if (total >= 22) {
    type = '탐험가 교사';
    desc = '새로운 것을 두려워하지 않고 실험하는 열정이 있습니다.';
  } else if (total >= 16) {
    type = '따라잡는 중 교사';
    desc = '익숙하지는 않지만 변화에 열린 자세를 가지고 있습니다.';
  } else {
    type = '전통 보수파 교사';
    desc = '기존 방식에 익숙하지만, 변화의 필요성은 느끼고 있습니다.';
  }

  document.getElementById('quiz').style.display = 'none';
  document.getElementById('resultType').innerText = type;
  document.getElementById('resultDesc').innerText = desc;
  document.getElementById('result').style.display = 'block';
});
